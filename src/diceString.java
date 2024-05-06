import java.util.Scanner;
public class diceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String toDice = sc.nextLine();

        diceString ds = new diceString();
        String[] result = ds.dice(toDice);
        int size = toDice.length();
        for (int i = 0; i < size; i++) {
            System.out.println(result[i]);
        }
    }
        public String[] dice (String s){
            int len = s.length();
            String[] arr = new String[len];
            for (int i = 0; i < len; i++) {
                arr[i] = String.valueOf(s.charAt(i));
            }
            return arr;
        }
    }
