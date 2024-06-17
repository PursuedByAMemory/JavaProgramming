import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class tcsS3 {
    public static void main(String[] args){
        System.out.println("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = str.charAt(0);
        int asciiVal = (int)c;
        System.out.println(asciiVal);
    }
}