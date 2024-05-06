import java.util.*;
import java.util.ArrayList;
public class preceeding {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        String s = "ab*cd*ef*";
        preceeding p = new preceeding();
        String result = p.preFunc(s);
        System.out.println(result);
    }
    public String preFunc(String s){
        ArrayList<Character> al = new ArrayList<>();
        char sArr[] = s.toCharArray();
        for(char c : sArr){
            al.add(c);
        }
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i+1).equals('*')){
                al.remove(i);
            }
        }
        al.removeIf(n -> n.equals('*'));
        String res = "";
        for(char b: al){
            res+=b;
        }
        return res;
    }
}
