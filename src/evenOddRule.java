import java.util.Scanner;
import java.util.ArrayList;
public class evenOddRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter date:");
        int d = sc.nextInt();
        System.out.println("Enter fine:");
        int x = sc.nextInt();
        evenOddRule e = new evenOddRule();
        int result = e.eoFunc(arr,d,x);
        System.out.println(result);
    }
    public int eoFunc(int arr[], int d, int f){
        int fine = 0;
        if(d%2==0) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2!=0){
                    fine += f;
                }
            }
        }else{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2==0){
                    fine += f;
                }
            }
        }
        return fine;
    }
}