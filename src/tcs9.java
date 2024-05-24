import java.util.Scanner;
public class tcs9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        tcs9 tcs9 = new tcs9();
        double result = tcs9.tcs9Func(arr);
        System.out.println(result);
    }
    public double tcs9Func(int arr[]){
        float sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += (double)arr[i];
        }
        double avg = sum/arr.length;
        return avg;
    }
}