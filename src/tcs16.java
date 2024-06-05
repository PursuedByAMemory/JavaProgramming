import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class tcs16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Elements: ");
        for(int i = 0 ; i < size; i++){
            arr[i] = sc.nextInt();
        }
        tcs16 tcs16 = new tcs16();
        ArrayList<Integer> result= tcs16.tcs16Func(arr);
        for(int i = 0 ; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public ArrayList<Integer> tcs16Func(int arr[]){
        int copy[] = Arrays.copyOf(arr,arr.length);
        for(int i = arr.length - 1; i > 0; i--){
            for(int j =0; j < i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        ArrayList<Integer> sorted = new ArrayList<>();
        ArrayList<Integer> og = new ArrayList<>();
        ArrayList<Integer> rank = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            og.add(copy[i]);
            sorted.add(arr[i]);
        }
//        for(int i =0; i < copyAL.size(); i++){
//            rank.add(sorted.indexOf(copy[i]));
//        }
        for(int i =0; i < og.size() ;i++){
            rank.add(sorted.indexOf(og.get(i)));
        }
        return rank;
    }
}
