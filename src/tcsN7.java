import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class tcsN7 {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter 1 for EvenOrOdd, 2 for PositiveOrNegative, 3 for ReverseDigit");
        int exp = sc.nextInt();
        tcsN7 n7 = new tcsN7();

        switch(exp){
            case 1:
                //Some code
                String result1 = n7.evenOrOdd(n);
                System.out.println(result1);
                break;
            case 2:
                //Some code
                String result2 = n7.positiveOrNegative(n);
                System.out.println(result2);
                break;
            case 3:
                //some code
                int result3 = n7.reverseDigit(n);
                System.out.println(result3);
                break;
        }
    }
    public String evenOrOdd(int num){
        if(num%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    public String positiveOrNegative(int num){
        if(num>0){
            return "Positive";
        } else if (num < 0) {
            return  "Negative";
        }
        else{
            return "Neither Positive Not Negative";
        }
    }
    public int reverseDigit(int n){
        String nString = String.valueOf(n);
        ArrayList<Character> al = new ArrayList<>();
        for(int i = 0; i < nString.length(); i++){
            al.add(nString.charAt(i));
        }
        String rev = "";
        while(!al.isEmpty()){
            rev += al.remove(al.size() - 1);
        }
        return Integer.parseInt(rev);
    }
}
