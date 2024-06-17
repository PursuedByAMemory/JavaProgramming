import java.util.Scanner;
import java.util.ArrayList;
public class tcsN11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for Harshad Number");
        int num = sc.nextInt();
        int sum = 0;
        String numString = String.valueOf(num);
        for(int i = 0;i < numString.length(); i++){
            sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        if(num%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a harshad number");
        }
    }
}
