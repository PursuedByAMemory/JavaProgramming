import java.util.Scanner;
import java.util.ArrayList;
public class experiments {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<6;i++){
            al.add(i);
        }

        for(int i=0;i<al.size();i++) {
            System.out.print(al.get(i)+" ");
        }
    }
}
