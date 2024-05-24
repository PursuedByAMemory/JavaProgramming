import java.util.Scanner;
public class tcs10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        System.out.println("Elements: ");
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = arr.length - 1;i > 0 ;i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        if(arr.length%2==0){
            int mid1 = arr[(arr.length/2) - 1];
            int mid2 = arr[(arr.length)/2];
            float median = (float) (mid1 + mid2)/2;
            System.out.println(median);
        }else{
            int median = arr[arr.length/2];
            System.out.println(median);
        }
    }
}