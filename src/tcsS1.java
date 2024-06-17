import java.util.ArrayList;
import java.util.Scanner;
public class tcsS1 {
    public static void main(String[] args){
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        ArrayList<Character> al = new ArrayList<>();
        for(int i = 0; i < s1.length(); i++){
            al.add(s1.charAt(i));
        }
        String rev = "";
        while(!al.isEmpty()){
            rev+=al.remove(al.size()-1);
        }
        if(rev.equals(s1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
