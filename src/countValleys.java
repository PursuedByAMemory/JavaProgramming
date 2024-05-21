import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class countValleys {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        String arr[] = new String[steps];
        for(int i = 0; i < steps;i++){
            arr[i] = sc.next();
        }
        countValleys cv = new countValleys();
        String[] result = cv.cvFunc(arr, steps);
        System.out.println(Arrays.toString(result));
    }

    public String[] cvFunc(String[] arr, int s){
        String result[];
        ArrayList<Character> al = new ArrayList<>();
        int dCount = 0;
        int uCount = 0;
        for(int i = 0; i < arr.length - 2;i++) {
                if (arr[i].equalsIgnoreCase("d")) {
                    dCount++;
                } else if (arr[i].equalsIgnoreCase("u")) {
                    uCount++;
                }
        }
        String dCountS = Integer.toString(dCount);
        String uCountS = Integer.toString(uCount);
        result = new String[]{dCountS, uCountS};
        return result;
    }
}
