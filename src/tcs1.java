import java.util.Scanner;
public class tcs1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int size = sc.nextInt();
        System.out.println("Elements: ");
        int arr[] = new int[size];
        for(int i =0; i < size;i++){
            arr[i] = sc.nextInt();
        }
        tcs1 tcs1 = new tcs1();
        int result = tcs1.tcs1Func(arr);
        System.out.println(result);
    }
    public int tcs1Func(int arr[]){
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
