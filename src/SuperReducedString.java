import java.util.Scanner;
import java.util.ArrayList;
public class SuperReducedString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        SuperReducedString srs = new SuperReducedString();
        String result = srs.reduceFunc(s);
        System.out.println(result);
    }
    public String reduceFunc(String s){
        int size = s.length();
        ArrayList<Character> al = new ArrayList<>();
        for(char c : s.toCharArray()){
            al.add(c);
        }
        for(int a = 0; a<al.size()-1;){
            if (al.get(a).equals(al.get(a + 1))){
                al.remove(a);
                al.remove(a);
            }else{
                a++;
            }
        }
        if(al.size()==2){
            for(int i = 0; i < (al.size());i++){
                if(al.get(i).equals(al.get(i+1))) {
                    al.remove(al.get(i));
                    al.remove(al.get(i));
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Character ele : al){
            stringBuilder.append(ele);
        }
        if(al.isEmpty()){
            return "Empty String";
        }else{
            return stringBuilder.toString();
        }
    }
}
