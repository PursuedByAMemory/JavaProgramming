import java.util.Scanner;
import java.util.ArrayList;
public class tcs6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size? ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        tcs6 tcs6 = new tcs6();
        ArrayList<Integer> result = tcs6.tcs6Func(arr);
        for(int i = 0; i < result.size();i++){
            System.out.println(result.get(i));
        }
    }
    public ArrayList<Integer> tcs6Func(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> stack = new ArrayList<>();
        for(int i = arr.length - 1; i > 0;i--){
            for(int j = 0 ; j < i ;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < (arr.length)/2;i++){
            ans.add(arr[i]);
        }
        for(int i = 0; i < arr.length;i++){
            stack.add(arr[i]);
        }
        for(int i = 0; i < (arr.length)/2;i++){
            ans.add(stack.remove(stack.size()-1));
        }
        return ans;
    }
}
