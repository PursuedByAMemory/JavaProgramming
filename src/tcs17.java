import java.util.ArrayList;
import java.util.Scanner;

public class tcs17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Elements: ");
        for(int i = 0 ; i < size; i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Left or Right?");
        String dir = sc.nextLine();
        System.out.println("K?");
        int k = sc.nextInt();
        tcs17 tcs17 = new tcs17();
        ArrayList<Integer> result= tcs17.tcs17Func(arr,dir,k);
        System.out.println(result);
    }
    public ArrayList<Integer> tcs17Func(int arr[], String d, int k){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            al.add(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();

        if(d.equalsIgnoreCase("right")){
            int temp = k;
            for(int i = 0; i < k;i++){
                ans.add(arr[arr.length-temp]);
                temp--;
            }
            for(int j = 0; j < arr.length - k; j++){
                ans.add(arr[j]);
            }
        }else if(d.equalsIgnoreCase("left")){
            int temp = k;
            for(int i = 0; i < k; i++){
                ans.add(arr[temp]);
                temp++;
            }
            for(int i = 0; i < k; i++){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}