import java.util.ArrayList;
import java.util.Scanner;
public class tcsN2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> range = new ArrayList<>();
        System.out.println("Min?");
        int min = sc.nextInt();
        System.out.println("Max?, not inclusive");
        int max = sc.nextInt();
        for(int i = min; i<max;i++){
            range.add(String.valueOf(i));
        }
        tcsN2 n2 = new tcsN2();
        ArrayList<String> result = n2.n2Func(range);
        System.out.println(range);
        System.out.println(result);
    }
    public ArrayList<String> n2Func(ArrayList<String> r){
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i<r.size();i++){
            StringBuilder sb = new StringBuilder(r.get(i));
            String rev = sb.reverse().toString();
            if(r.get(i).equals(rev)){
                al.add(r.get(i));
            }
        }
        return al;
    }
}
