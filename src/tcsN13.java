import java.util.Scanner;
import java.util.ArrayList;
public class tcsN13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to test for a Strong Number");
        int num = sc.nextInt();
        tcsN13 n13 = new tcsN13();
        String numString = String.valueOf(num);
        int sum = 0;
        for(int i = 0; i < numString.length(); i++){
            sum+= n13.fact(Integer.parseInt(String.valueOf(numString.charAt(i))));
        }
        if(num==sum){
            System.out.println("Stronk Number");
        }else{
            System.out.println("Not strong");
        }
    }
    public int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
}
