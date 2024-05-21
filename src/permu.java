import java.util.ArrayList;
import java.util.Scanner;
public class permu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        permu p = new permu();
        int result = (2*1)*p.factorial(n-1);
        System.out.println(result);
    }
    public int factorial(int num){
        if(num==1){
            return 1;
        }
        return num * factorial(num-1);
    }
}
