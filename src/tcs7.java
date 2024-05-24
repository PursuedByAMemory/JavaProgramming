import java.util.Scanner;
public class tcs7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        tcs7 tcs7 = new tcs7();
        int result = tcs7.tcs7Func(arr);
        System.out.println(result);
    }
    public int tcs7Func(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}