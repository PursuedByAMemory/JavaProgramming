import java.util.Scanner;
public class divisiblePairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        divisiblePairs d = new divisiblePairs();
        int result = d.divFunc(n,k,arr);
        System.out.println(result);
    }
    public int divFunc(int n, int d, int arr[]){
        int c= 0;
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                if (arr[i] < arr[j]) {
                    if ((arr[i] + arr[j]) % d == 0) {
                        c+=1;
                    }
                }
            }
        }
        return c;
    }
}