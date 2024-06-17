import java.util.Scanner;
public class tcsN9 {
    public static void main(String[] args){
        System.out.println("Enter the first value");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the second value");
        int n2 = sc.nextInt();
        System.out.println("Enter the third value");
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is greatest");
        }else if(n2>n1 && n2>n3){
            System.out.println(n2+" is greatest");
        }else{
            System.out.println(n3+" is greatest");
        }
    }
}
