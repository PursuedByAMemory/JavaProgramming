import java.util.Scanner;
import java.util.ArrayList;
public class tcsN3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number? ");
        int num = sc.nextInt();
        double numSquareRoot = Math.sqrt((double)num);
        boolean prime = true;
        if(num%2==0 && num!=2){
            prime = false;
        }else if(num%3==0 && num!=3){
            prime = false;
        }else {
            for(int i = 5; i < numSquareRoot+1; i = i + 2){
                if(num%i==0){
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}
