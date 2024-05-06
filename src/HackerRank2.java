import java.util.Scanner;
public class HackerRank2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String rawInput = sc.nextLine();
        String[] split = rawInput.split("\\s+");
        int[] numbers = new int[len];
        for(int i = 0; i <= len - 1; i++){
            numbers[i] = Integer.parseInt(split[i]);
        }
        System.out.println("Array elements: ");
        for(int p = 0; p <= len - 1; p++){
            System.out.print(numbers[p] + " ");
        }
        HackerRank2 hr2 = new HackerRank2();
        int result = hr2.arraySum(numbers);
        System.out.println(result);
    }
    public int arraySum(int[] num){
        int sum = 0;
        int len = num.length;
        for(int j=0; j <= len-1; j++){
            sum += num[j];
        }
        return sum;
    }
}