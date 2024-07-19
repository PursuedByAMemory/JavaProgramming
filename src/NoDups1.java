import java.util.Scanner;
import java.util.HashSet;
public class NoDups1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array?");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter the "+i+"th element: ");
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}
