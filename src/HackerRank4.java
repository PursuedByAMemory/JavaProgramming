import java.util.Scanner;
public class HackerRank4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.nextLine();
        int c = r;
        StringBuilder rawInput = new StringBuilder(sc.nextLine());
        for (int i = 0; i < 3; i++) {
            rawInput.append(" ").append(sc.nextLine());
        }


        String[] split = rawInput.toString().split("\\s+");
        int[][] arr2d = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2d[i][j] = Integer.parseInt(split[i * r + j]);
            }
        }
        HackerRank4 hr = new HackerRank4();
        int result = hr.diff(arr2d,r);
        System.out.println(result);
        /*
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr2d[i] == arr2d[j]) {
                    sum1 = sum1 + arr2d[i][j];
                }
                //System.out.println(arr2d[i][j]);
            }
        }
        //System.out.println(sum1);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr2d[i][j] == arr2d[i][c - 1 - i]) {
                    sum2 = sum2 + arr2d[i][j];
                }
            }
        }
        //System.out.println(sum2);
        System.out.println(Math.abs(sum1 - sum2));
         */
    }
    public int diff(int[][] arr2, int size){
        int r = size;
        int c = r;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr2[i] == arr2[j]) {
                    sum1 = sum1 + arr2[i][j];
                }
                //System.out.println(arr2d[i][j]);
            }
        }
        //System.out.println(sum1);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr2[i][j] == arr2[i][c - 1 - i]) {
                    sum2 = sum2 + arr2[i][j];
                }
            }
        }
        //System.out.println(sum2);
        return (Math.abs(sum1 - sum2));
    }
}