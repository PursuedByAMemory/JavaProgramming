import java.util.ArrayList;
import java.util.Scanner;
public class tcs14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        System.out.println("Elements?");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i]=sc.nextInt();
        }
        tcs14 tcs14 = new tcs14();
        int result = tcs14.tcs14Func(arr);
        System.out.println(result);
    }
    public int tcs14Func(int arr[]){
        int ans = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i +1; j < arr.length; j++){
                int prod = 1;
                for(int k = i; k <= j; k++){
                    prod *= arr[k];
                }
                ans = Math.max(ans, prod);
            }
        }
        return ans;
    }
}
