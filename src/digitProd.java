import java.util.Scanner;
import java.util.ArrayList;
public class digitProd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int prod=1;
        for(int i = 0; i < num.length(); i++){
            prod *= Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(prod);
    }
}
