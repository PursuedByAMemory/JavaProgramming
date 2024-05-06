import java.util.Scanner;
public class highestFreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        highestFreq h = new highestFreq();
        String result = h.freqFunc(arr);
        System.out.println(result);
    }
    public String freqFunc(int[] arr){
        boolean counted[] =new boolean[arr.length];
        int len = arr.length;
        for(int i = 0;i<len;i++){
            for(int j = i; j<len;j++){
                if(arr[i]==arr[j]){
                    counted[j] = true;
                }
            }
            for(int p = i; p<len; p++){
                if (counted[i]) {
                    continue;
                }
            }
        }
        return "sickest bro";
    }
}
