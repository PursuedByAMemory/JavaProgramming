import java.util.Scanner;
public class factRecur {
    public static void main(String[] args){
        factRecur fr = new factRecur();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you'd like to see the Factorial of: ");
        int n = sc.nextInt();
        int result = fr.recur(n);
        System.out.println(result);
    }
    public int recur(int num){
        if(num==1){
            return 1;
        }
        return (num*recur(num-1));
    }
}
