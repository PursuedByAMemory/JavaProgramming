import java.util.Scanner;
import java.util.ArrayList;
public class sock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sock s = new sock();
        int out = 0;
        ArrayList<Integer> result = s.sockFunc(arr);
        for(Integer ele : result){
            out += (ele/2);
            //System.out.println(ele);
        }
        System.out.println(out);
    }
    public ArrayList<Integer> sockFunc(int[] arr){
        int count = 0;
        ArrayList<Integer> al = new ArrayList<>();
        boolean[] counted = new boolean[arr.length];
        for(int i =0;i<arr.length;i++){
            if(counted[i]){
                continue;
            }

            for(int j = i; j < arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    counted[j] = true;
                }
            }
            al.add(count);
            count = 0;
        }
        return al;
    }
}