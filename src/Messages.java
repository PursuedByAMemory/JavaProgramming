import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.*;
public class Messages {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Messages m = new Messages();
        int result = m.messFunc(s);
        System.out.println(result);
    }
    public int messFunc(String s){
        ArrayList<Character> al = new ArrayList<>();
        Pattern p = Pattern.compile("[SO]");
        //Pattern p2 = Pattern.compile("[SO]");
        //Pattern p3 = Pattern.compile("[SO]");
        Matcher m;
        int count =0;
        for(char c : s.toCharArray()){
            al.add(c);
        }
        int len = al.size();
        for(int i = 0; i < len; i++){
            m = p.matcher(Character.toString(al.get(i)));
            if(!m.find()){
                count++;
            }
        }
        return count;
    }
}
