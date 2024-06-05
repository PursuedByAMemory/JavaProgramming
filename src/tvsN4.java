import java.util.ArrayList;
import java.util.Scanner;
public class tvsN4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Lower limit?");
        int lower = sc.nextInt();
        System.out.println("Upper limit?");
        int upper = sc.nextInt();
        tvsN4 n4 = new tvsN4();
        for(int i = lower; i < upper; i++){
            if(n4.isPrime(i)){
                al.add(i);
            }
        }
        System.out.println(al);
    }
    public boolean isPrime(int i) {
        boolean prime = true;
        double numSquareRoot = Math.sqrt((double) i);
        if (i % 2 == 0 && i!=2) {
            return false;
        } else if (i % 3 == 0 && i!=3) {
            return false;
        } else {
            for (int j = 5; j < numSquareRoot+1; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}