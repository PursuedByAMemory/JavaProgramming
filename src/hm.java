import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
public class hm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> emp = new HashMap<String, Integer>();
        System.out.println("Enter the size");
        int size = sc.nextInt();
        for(int i = 0; i < size;i++){
            emp.put(sc.next(), sc.nextInt());
        }
        System.out.println(emp.keySet());
        System.out.println(emp.values());
    }
}
