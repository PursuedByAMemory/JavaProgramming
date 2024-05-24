import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tcs8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("K?");
        int k = sc.nextInt();
        tcs8 tcs8 = new tcs8();
        int[] result = tcs8.tcs8Func(arr,k);
        System.out.println(Arrays.toString(result));

    }
    public int[] tcs8Func(int arr[], int k){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = k; i<arr.length;i++){
            al.add(arr[i]);
        }
        for(int i = 0; i<k;i++){
            al.add(arr[i]);
        }
        int ans[] = new int[al.size()];
        for(int i = 0; i < al.size();i++){
            ans[i] = al.get(i);
        }
        return ans;
    }
}
