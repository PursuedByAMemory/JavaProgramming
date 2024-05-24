import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class tcs11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        System.out.println("Elements: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        tcs11 tcs11 = new tcs11();
        Integer result[] = tcs11.tcs11Func(arr);
        System.out.println(Arrays.toString(result));
    }
    public Integer[] tcs11Func(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }
        Integer noDups[] = hs.toArray(new Integer[0]);
        return noDups;
    }
}
