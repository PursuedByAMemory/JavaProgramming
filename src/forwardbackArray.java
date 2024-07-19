import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class forwardbackArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int s = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[s];
        for(int i = 0; i < s; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        //ArrayList<Integer> backward = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        if(arr.length%2==0){
            System.out.println("Median is: "+ (float)(arr[arr.length/2 - 1]+arr[(arr.length/2)])/2);
        }else{
            System.out.println("Median is: "+ arr[arr.length/2]);
        }
        for(int i = 0; i < arr.length/2; i++){
            result.add(arr[i]);
        }
        for(int j = arr.length-1; j >= arr.length/2; j--){
            result.add(arr[j]);
        }
        System.out.println(result);
    }
}
