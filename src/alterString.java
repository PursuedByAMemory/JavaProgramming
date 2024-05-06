import java.util.*;
public class alterString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String s = sc.nextLine();
        alterString alt = new alterString();
        int result= alt.altFunc(s,len);
        System.out.println(result);
    }
    public int altFunc(String s, int len){
        ArrayList<Character> al = new ArrayList<>();
        for(char c:s.toCharArray()){
            al.add(c);
        }
        ArrayList<Integer> ind = new ArrayList<>();
        for(int i = 0; i < al.size(); i++){
            char val = al.get(0);
            for(int j = i; j<al.size();j++){
                if(Objects.equals(val,al.get(j))){
                    ind.add(j);
                }
            }
        }
        return 1;
    }
}
