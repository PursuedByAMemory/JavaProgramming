import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.ArrayList;
public class CamelCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word= sc.nextLine();
        CamelCase cc = new CamelCase();
        ArrayList<Integer> result = cc.ccFunc(word);
        System.out.println(result.size()+1);
    }
    public ArrayList<Integer> ccFunc(String w){
        ArrayList<Integer> al = new ArrayList<>();
        char[] arr = w.toCharArray();
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(w);
        while(m.find()){
            al.add(m.start());
        }
        //w.substring(0)
        return al;
    }
}
