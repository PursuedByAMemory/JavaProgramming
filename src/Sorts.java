import java.util.Arrays;
import java.util.Scanner;

public class Sorts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < size;i++){
            System.out.println("Enter the "+ i+"th element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter 1 for Bubble sort, 2 for selection sort, 3 for insertion sort and 4 for Arrays.sort()");
        Sorts s = new Sorts();
        int sort = sc.nextInt();
        switch(sort){
            case 1 :
                s.bubbleSort(arr);
                break;
            case 2:
                s.selectionSort(arr);
                break;
            case 3:
                s.insertionSort(arr);
                break;
            case 4:
                Arrays.sort(arr);
            default:
                System.out.println("Select between 1, 2, 3 or 4");
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void bubbleSort(int arr[]){
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){ //Ascending Order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void selectionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j]<arr[minIndex]){  //Ascending Order
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
    public void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
