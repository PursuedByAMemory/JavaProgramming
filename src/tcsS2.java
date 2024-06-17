import java.util.ArrayList;
import java.util.regex.*;
import java.util.Scanner;
public class tcsS2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern con = Pattern.compile("[A-Z&&[^AEIOU]]",Pattern.CASE_INSENSITIVE);
        Pattern vow = Pattern.compile("[AEIOU]",Pattern.CASE_INSENSITIVE);
        Pattern spa = Pattern.compile(" ",Pattern.CASE_INSENSITIVE);
        Matcher matCon = con.matcher(str);
        Matcher matVow = vow.matcher(str);
        Matcher matSpa = spa.matcher(str);
        int conCount=0;
        int vowCount=0;
        int spaCount=0;
        while(matCon.find()){
            conCount++;
        }
        while(matVow.find()){
            vowCount++;
        }
        while(matSpa.find()){
            spaCount++;
        }
        System.out.println("Vowels: "+vowCount);
        System.out.println("Consonants: "+conCount);
        System.out.println("Spaces: "+spaCount);
    }
}
