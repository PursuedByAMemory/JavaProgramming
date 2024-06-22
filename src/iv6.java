import java.util.Scanner;
import java.util.Arrays;
public class iv6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //Arrays.sort(arr);
        for(int i = arr.length -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Second smallest: "+ arr[1]);
        System.out.println("Second Largest: "+arr[arr.length - 2]);
    }
}
