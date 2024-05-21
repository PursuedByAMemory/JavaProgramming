import java.util.ArrayList;
import java.util.Scanner;
public class chocFactoryAL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            al.add(sc.nextInt());
        }
        chocFactoryAL c = new chocFactoryAL();
        ArrayList<Integer> result= c.chocALFunc(al);
        for(int i = 0; i < result.size();i++) {
            System.out.println(result.get(i));
            System.out.println();
        }
    }

    public ArrayList<Integer> chocALFunc(ArrayList<Integer> al){
        int count=0;
        for(int i = 0; i<al.size();i++){
            if(al.get(i) == 0){
                count++;
                al.remove(al.get(i));
            }
        }
        for(int i = 0; i<count; i++){
            al.add(0);
        }
        return al;
    }
}
