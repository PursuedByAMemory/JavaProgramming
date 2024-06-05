import java.util.ArrayList;
import java.util.Scanner;
public class tcsN1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int arr[] = new int[n.length()];
        for(int i = 0 ; i < n.length(); i++){
            arr[i] = n.charAt(i);
        }
        tcsN1 n1 = new tcsN1();
        boolean result = n1.n1Func(arr,n);
        System.out.println(result);
    }
    public boolean n1Func(int arr[], String n){
        ArrayList<Character> al = new ArrayList<>();
        for(char c : n.toCharArray()){
            al.add(c);
        }
        String rev = "";
        while(!al.isEmpty()){
            rev += al.remove(al.size()-1);
        }
        if(n.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}
