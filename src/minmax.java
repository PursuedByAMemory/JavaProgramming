import java.util.Scanner;
public class minmax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String toSplit = sc.nextLine();
        String[] split1 = toSplit.split("\\s+");
        int len = split1.length;
        long[] arr = new long[len];
        for(int i = 0;i<len;i++){
            arr[i] = Long.parseLong(split1[i]);
        }
        minmax mm = new minmax();
        long[] result = mm.minmaxFunc(arr);
        System.out.println(result[0]+" "+result[1]);
    }
    public long[] minmaxFunc(long[] funcArr){
        int funcLen = funcArr.length;
        long sum=0;
        long[] corrSum = new long[funcLen];
        for(int i = 0; i<funcLen; i++){
            sum += funcArr[i];
        }
        for(int i = 0; i<funcLen; i++){
            corrSum[i] = sum - funcArr[i];
        }
        long min = corrSum[0];
        long max = corrSum[0];
        for(int i = 0; i < funcLen; i++){
            if(min>corrSum[i]){
                min = corrSum[i];
            }
        }
        for(int i = 0; i < funcLen; i++){
            if(max<corrSum[i]){
                max = corrSum[i];
            }
        }
        long[] fin = {min,max};
        return fin;
    }
}