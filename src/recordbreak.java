import java.util.Scanner;
public class recordbreak {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        recordbreak rc = new recordbreak();
        int[] result = rc.breakingRecords(arr);
        System.out.println(result[0]+" "+result[1]);
    }
    public int[] breakingRecords(int[] s){
        int min=s[0];
        int max=s[0];
        int minC=0;
        int maxC=0;
        for(int i = 0; i < (s.length);i++){
            if(s[i]<min){
                min = s[i];
                minC+=1;
            }else if(s[i]>max){
                max = s[i];
                maxC+=1;
            }
        }
        int[] out = {maxC, minC};
        return out;
    }
}
