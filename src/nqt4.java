import java.util.Scanner;
public class nqt4 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        nqt4 n4 = new nqt4();
        int result = n4.nqt4Func(arr);
        System.out.println(result);
    }
    public int nqt4Func(int arr[]){
        int count=0;
        int max = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                count++;
                max=arr[i];
            }
        }
//        if(arr[arr.length-1] > arr[arr.length-2]){
//            count++;
//        }
        return count;
    }
}
