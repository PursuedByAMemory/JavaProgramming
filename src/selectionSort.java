import java.util.*;

public class selectionSort {
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
    public void sSort(int[] arr){
        for(int i =0; i < (arr.length);i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length ;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
}