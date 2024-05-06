import java.util.Scanner;
public class cake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String toSplit = sc.nextLine();
        String[] split1 = toSplit.split("\\s+");
        int[] height = new int[size];
        for(int i = 0; i < size ; i++){
            height[i] = Integer.parseInt(split1[i]);
        }
        cake c = new cake();
        int result = c.birthdayCakeCandles(height);
        System.out.println(result);
    }
        public int birthdayCakeCandles(int[] h){
            int len = h.length;
            int max = h[0];
            int maxCount = 0;
            for(int i = 0 ;i< len;i++) {
                if (max < h[i]) {
                    max = h[i];
                }
            }
            for(int i = 0 ;i< len;i++){
                if(max==h[i]){
                    maxCount += 1;
                }
            }
            return maxCount;
        }
}
