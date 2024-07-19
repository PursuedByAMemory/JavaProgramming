import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class NoRepeat {
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
        ArrayList<Integer> outputList = new ArrayList<>();
        boolean checked[] = new boolean[arr.length];
        for(int i = 0 ; i < arr.length; i++){
            if(checked[i]){
                continue;
            }
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && i!=j){
                    checked[i] = true;
                    break;
                }
            }
            if(!checked[i]){
                outputList.add(arr[i]);
            }
        }
        System.out.println(outputList);
    }
}
