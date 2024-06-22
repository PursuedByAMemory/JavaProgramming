import java.util.Scanner;
import java.util.ArrayList;
public class FirstRep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        FirstRep fr = new FirstRep();
        int result = fr.frFunc(arr);
        System.out.println(result);
    }
    public int frFunc(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        int count=0;
        boolean checked[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(checked[i]){
                continue;
            }
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    checked[j]=true;
                }
            }
            if(count>0) {
                al.add(arr[i]);
            }
            count = 0;
        }
        return al.get(0);
    }
}
