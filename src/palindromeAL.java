import java.util.Scanner;
import java.util.ArrayList;
public class palindromeAL {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to test");
        Scanner sc = new Scanner(System.in);
        int checkVal = sc.nextInt();
        palindromeAL palal = new palindromeAL();
        String result = palal.palChecker(checkVal);
        System.out.println(result);
    }

    public String palChecker(int val){
        ArrayList<Character> stack = new ArrayList<>();
        String NumString = Integer.toString(val);
        int len = NumString.length();
        for(char c: NumString.toCharArray()){
            stack.add(c);
        }
        String revString = "";
        while(!stack.isEmpty()){
            revString += stack.remove((stack.size()) - 1);
        }
        if(NumString.equals(revString)){
            return "Its a palindrome";
        }else{
            return "Not a palindrome";
        }
    }
}