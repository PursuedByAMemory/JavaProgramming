import java.util.HashMap;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array?");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter the "+i+"th element: ");
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Manu");
        hm.put(2, "Sonu");
        hm.put(3, "Nonu");
//        for(int i = 0; i < hm.size(); i++){
//
//        }
        for(int i : hm.keySet()){
            System.out.println(i);
        }
        for(String s:hm.values()){
            System.out.println(s);
        }
    }
}
