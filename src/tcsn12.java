import java.util.Scanner;
import java.util.ArrayList;
public class tcsn12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int x = sc.nextInt();
        int prod = 1;
        for(int i = 0; i < x; i++){
            prod *= n;
        }
        System.out.println(prod);

    }
}
