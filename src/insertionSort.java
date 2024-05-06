import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values are there dude?");
        int n = sc.nextInt();
        System.out.println("Type the values in a space separated line lad");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort ss = new selectionSort();
        ss.sSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void inSort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int temp = arr[i];
            int j = i - 1;
            while(j < -1 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
