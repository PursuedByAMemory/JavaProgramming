import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class tcs12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        System.out.println("Elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        tcs12 tcs12 = new tcs12();
        ArrayList<Integer> result = tcs12.tcs12Func(arr);
        System.out.println(result);
    }
    public ArrayList<Integer> tcs12Func(int arr[]){
        ArrayList<Integer> al= new ArrayList<>();
        boolean checked[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(checked[i]){
                continue;
            }
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && i!=j){
                    al.add(arr[i]);
                    checked[j] = true;
                }
            }
        }
        return al;
    }
}