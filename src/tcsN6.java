import java.util.Scanner;
import java.util.ArrayList;
public class tcsN6 {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to check for Perfect Number");
        int n = sc.nextInt();
        for(int i = 1; i < n+1;i++){
            if(n%i==0 && n!=i){
                al.add(i);
            }
        }
        int sum = 0;
        for(int j = 0; j < al.size(); j++){
            sum += al.get(j);
        }
        if(n == sum){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not A Perfect Number");
        }
        //System.out.println(sum);
    }
}
