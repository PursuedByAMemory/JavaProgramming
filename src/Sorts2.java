import java.util.Scanner;
public class Sorts2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
