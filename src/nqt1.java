import java.util.Scanner;
import java.util.ArrayList;
public class nqt1 {
    public static void main(String[] args){
        System.out.println("Enter size");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int size = sc.nextInt();
        //int arr[] = new int[size];
        for(int i = 0; i<size;i++){
            al.add(sc.nextInt());
        }
        nqt1 n = new nqt1();
        ArrayList<Integer> result= n.nqtfunc(al);
        for(int i =0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
    }
    public ArrayList<Integer> nqtfunc(ArrayList<Integer> al){
        int count=0;
        for(int i = 0; i<al.size();i++){
            if(al.get(i) == 0){
                count++;
//                al.set(al.size()-1,al.get(i));
                al.remove(al.get(i));
            }
        }
        for(int i = 0;i<count;i++){
            al.add(0);
        }
        return al;
    }
}
