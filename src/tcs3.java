import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class tcs3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int size = sc.nextInt();
        System.out.println("Elements: ");
        int arr[] = new int[size];
        for(int i =0; i < size;i++){
            arr[i] = sc.nextInt();
        }
        tcs3 tcs3 = new tcs3();
        int result[]= tcs3.tcs3Func(arr);
        if(result.length==1){
            System.out.println(result[0]);
        }else{
            System.out.println("Second lowest: " + result[0]);
            System.out.println("Second highest: " + result[1]);
        }
    }
    public int[] tcs3Func(int arr[]){
        for(int i = arr.length-1; i > 0 ; i--){
            for(int j = 0 ; j < i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[ j+1];
                    arr[j+1] = temp;
                }
            }
        }
        HashSet<Integer> noDups = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            noDups.add(arr[i]);
        }

        ArrayList<Integer> al = new ArrayList<>(noDups);

        if(al.size() < 2){
            int ans[] = new int[1];
            ans = new int[] {-1};
            return ans;
        }else {
            int ans[] = new int[1];
            ans = new int[]{al.get(1), al.get(al.size() - 2)};
            return ans;
        }
    }
}
