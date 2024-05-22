import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class tcs4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        tcs4 tcs4 = new tcs4();
        int result[] = tcs4.tcs4Func(arr);
        System.out.println(Arrays.toString(result));
    }
    public int[] tcs4Func(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            al.add(arr[i]);
        }
        int rev[] = new int[al.size()];
        for(int j = 0; j < rev.length; j++){
            rev[j]=al.remove(al.size() - 1);
        }
        return rev;
    }
}