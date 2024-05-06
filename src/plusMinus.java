import java.util.Scanner;

public class plusMinus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String toSplit = sc.nextLine();
        String[] split1 = toSplit.split("\\s+");
        int[] arrToFunc = new int[size];
        for(int i = 0; i < size ; i++){
            arrToFunc[i] = Integer.parseInt(split1[i]);
        }


        plusMinus pm = new plusMinus();
        String[] result = pm.plusMinusFunc(arrToFunc);
        for(int i = 0; i < 3 ;i++){
            System.out.println(result[i]);
        }
    }
    public String[] plusMinusFunc(int arr[]){
        int posCount=0;
        int negCount=0;
        int zeroCount=0;
        int arrLen = arr.length;
        for(int i = 0;i < arrLen; i++){
            if (arr[i] > 0) {
                posCount += 1;
            } else if (arr[i] < 0) {
                negCount += 1;
            } else {
                zeroCount += 1;
            }
        }
        float FloatPOS = (float)posCount/arrLen;
        float FloatNEG = (float)negCount/arrLen;
        float FloatZERO = (float)zeroCount/arrLen;
        String formattedPOS = String.format("%.6f", FloatPOS);
        String formattedNEG = String.format("%.6f", FloatNEG);
        String formattedZERO = String.format("%.6f", FloatZERO);
        String[] count = {formattedPOS,formattedNEG,formattedZERO};
        return count;
    }
}