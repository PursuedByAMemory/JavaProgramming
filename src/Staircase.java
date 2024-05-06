import java.util.Scanner;
public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Staircase sObj = new Staircase();
        String output = sObj.stairFunc(size);
        System.out.println(output);
    }
        public String stairFunc(int s){
        StringBuilder formattedString = new StringBuilder();
        for(int i = 1;i<=s;i++){
            formattedString.append(" ".repeat(s - i));
            formattedString.append("*".repeat(i));
            if(i==s){
                break;
            }else{
                formattedString.append("\n");
            }
        }
        return formattedString.toString();
    }
}
