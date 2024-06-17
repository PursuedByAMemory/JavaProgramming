import java.util.Scanner;

public class tcsN10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of: ");
        int n = sc.nextInt();
        tcsN10 n10 = new tcsN10();
        int result = n10.fact(n);
        System.out.println(result);
    }
    public int fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num-1);
    }
}
