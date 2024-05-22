import java.util.Scanner;
public class tcs2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int size = sc.nextInt();
        System.out.println("Elements: ");
        int arr[] = new int[size];
        for(int i =0; i < size;i++){
            arr[i] = sc.nextInt();
        }
        tcs2 tcs2 = new tcs2();
        int result = tcs2.tcs2Func(arr);
        System.out.println(result);
    }
    public int tcs2Func(int arr[]){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
