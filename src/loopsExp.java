import java.util.Scanner;

public class loopsExp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        for(int i = 0; i < num.length(); i++){
            System.out.println(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
    }
}
