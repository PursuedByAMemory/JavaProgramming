import java.util.Scanner;
import java.util.ArrayList;
public class preceeding2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        preceeding p = new preceeding();
        String result = p.preFunc(s);
        System.out.println(result);
    }
    public String preFunc2(String s){
        ArrayList<Character> al = new ArrayList<>();
        char sArr[] = s.toCharArray();
        for(char c:sArr){
            al.add(c);
        }
        int asterCount=0;
//        for(int i=0;i<al.size()-1;i++){
//            for(int j =0 ; j<al.size()-1;j++) {
//                while (!al.get(i + 1).equals('*')) {
//                    al.remove(i);
//                }
//            }
//        }
        for(int i = 0;i< al.size();) {
            while(al.get(i+1).equals('*')){
                asterCount++;
                if(!al.get(i+1).equals('*')){

                }
            }
        }
        String res="";
        for(int i = al.size();i>=0;i--){
            res += al.get(i);
        }
        return res;
    }
}
