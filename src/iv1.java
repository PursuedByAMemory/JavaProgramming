import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.HashSet;
public class iv1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        System.out.println("Elements?");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        iv1 iv1 = new iv1();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        iv1.selectionSort(arr);
        for(int j = 0 ; j < arr.length; j++){
            lhs.add(arr[j]);
        }
        System.out.println(lhs);
    }
    public void selectionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
