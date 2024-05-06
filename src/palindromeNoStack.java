import java.util.Scanner;
public class palindromeNoStack {
    public static void main(String[] args){
        System.out.println("Enter the number to check for palindrome");
        Scanner sc = new Scanner(System.in);
        int checkN = sc.nextInt();
        palindromeNoStack p = new palindromeNoStack();
        String[] result = p.palinfunc(checkN);
        for(int i = 0;i< result.length;i++){
            System.out.println(result[i]);
        }
    }

    public String[] palinfunc(int n){
        String NumString = String.valueOf(n);
        int len = NumString.length();
        String arr[] = new String[len];
        for(int i = 0;i<len;i++){
            arr[i] = String.valueOf(NumString.charAt(i));
        }
        int revArr[] = new int[len];
        for(int i = len-1; i>0;i--){
            for(int j =0; j<len;j++){

            }
        }
        //String revString =
        return arr;
    }
}
