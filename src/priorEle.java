import java.util.ArrayList;
import java.util.Scanner;
public class priorEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i< n;i++){
            arr[i] = sc.nextInt();
        }
        priorEle p = new priorEle();
        int result = p.priorFunc(arr);
        System.out.println(result);
    }
    public int priorFunc(int arr[]) {
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
