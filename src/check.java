import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;
public class check {
    public static void main(String[] args){
        String s = "beabeefeab";
        ArrayList<Character> al = new ArrayList<>();
        for(char c:s.toCharArray()){
            al.add(c);
        }
        int count = 0;
        ArrayList<Integer> ind = new ArrayList<>();
        ArrayList<Character> v = new ArrayList<>();
        ArrayList<Boolean> checked = new ArrayList<>(Collections.nCopies(al.size(),false));
        ArrayList<Integer> countList = new ArrayList<>();
        for(int i = 0; i < al.size();i++){
            char comp = al.get(i);
            for(int j = i; j<al.size();j++){
                if(checked.get(j) == false) {
                    if (Objects.equals(comp, al.get(j))) {
                        checked.set(j, true);
                        ind.add(j);
                        v.add(al.get(j));
                        count++;
                    }
                }
            }
            if(count>0) {
                countList.add(count);
                count = 0;
            }
        }
        //v.removeIf(n -> n==countList.get());
        for(int i = 0; i< v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println(v.size());
        for(int i=0;i<countList.size();i++) {
            System.out.print(countList.get(i)+" ");
        }
    }
}
