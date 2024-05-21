import java.util.Scanner;
import java.util.ArrayList;
public class nrProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int r = sc.nextInt();
        int nSum = 0;
        for(int i = 0; i < n.length(); i++){
            nSum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        System.out.println(nSum);
        int timesNSum = 0;
        for(int i = 0; i < r;i++){
            timesNSum += nSum;
        }
        System.out.println(timesNSum);
        nrProblem nr = new nrProblem();
        System.out.println(nr.digSum(String.valueOf(timesNSum)));

    }
    public int digSum(String n){
        int nSum = 0;
        for(int i = 0; i < n.length(); i++){
            nSum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        return nSum;
    }
}
