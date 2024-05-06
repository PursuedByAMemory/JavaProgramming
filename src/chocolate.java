import java.util.Scanner;
import java.util.ArrayList;
public class chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        chocolate c = new chocolate();
        int result = c.birthday(arr, d, m);
//        for (int val : result) {
//            System.out.println(val);
//        }
        System.out.println(result);
    }

    public int birthday(int[] arr, int d, int m) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <= arr.length - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += arr[j];
            }
            if (sum == d) {
                al.add(sum);
            }
        }
        int size = al.size();
        return size;
    }
}
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                for (int j = 0; j < m; j++) {
//                    sum += arr[j];
//                }
//                al.add(sum);
//                sum = 0;
//            } else if (i > 0) {
//                for (int p = i; p < m; p++) {
//                    if (((arr.length) - 1) - (p + m) == 0) { //makes sure it doesnt go out of bounds
//                        break;
//                    }
//                    sum += arr[p];
//                }
//                al.add(sum);
//                sum = 0;
//            }
//        }
//        return al;
//    }