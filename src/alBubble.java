import java.util.Scanner;
import java.util.ArrayList;
public class alBubble {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter integer elements: ");
        for(int i =0; i < s; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int j = 0; j < arr.length; j++){
            al.add(arr[j]);
        }
        for(int i = al.size() - 1; i > 0;i--){
            for(int j = 0; j < i; j++){
                if(al.get(i) > al.get(j)){
                    int temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        System.out.println(al);
    }
}
