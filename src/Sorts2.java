import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
public class Sorts2{
    public static void main(String[] args){
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i = 0; i < s; i++){
            System.out.println("Enter the "+ i +" element");
            arr[i] = sc.nextInt();
        }
        System.out.println(
                "Enter: " +
                "1 for bubble sort, " +
                "2 for selection sort, " +
                "3 for Arrays.sort(), " +
                        "4 for nothing"
        );
        Sorts2 s2 = new Sorts2();
        int op = sc.nextInt();
        switch(op){
            case 1:
                s2.bs(arr);
            case 2:
                s2.ss(arr);
            case 3:
                Arrays.sort(arr);
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }
        ArrayList<Integer> al = new ArrayList<>(hs);
        System.out.println(al);
        System.out.println("Third largest: ");
        System.out.println(al.get(al.size()-3));
    }
    public void bs(int arr[]){
        for(int i = arr.length - 1; i > 0;i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void ss(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(arr[minIndex]!=arr[i]){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}