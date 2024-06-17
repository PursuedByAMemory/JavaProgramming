import java.util.ArrayList;
import java.util.Scanner;
public class tcsN5 {
    public static void main(String[] args){
        System.out.println("Enter a number to check for Armstrong");
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int n = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = low; i < high+1; i++) {
            n = i;
            String nString = String.valueOf(n);
            int sum = 0;
            for (int j = 0; j < nString.length(); j++) {
                sum += Math.pow((double) Integer.parseInt(String.valueOf(nString.charAt(j))), (double) nString.length());
            }
            if (sum == n) {
                al.add(n);
            }
        }
        System.out.println(al);
    }
}