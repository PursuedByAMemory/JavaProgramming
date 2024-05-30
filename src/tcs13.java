import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class tcs13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows?");
        int r = sc.nextInt();
        System.out.println("How many columns?");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.println("Enter the " + i + "th and the " + j + "th element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        tcs13 tcs13 = new tcs13();
        ArrayList<String> result = tcs13.tcs13Func(arr);
        System.out.println(result);
    }

    public ArrayList<String> tcs13Func(int arr[][]){
        ArrayList<String> al = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int a = arr[i][0];
            int b = arr[i][1];

            // Check if the reverse pair exists in the map
            if(map.containsKey(b) && map.get(b) == a){
                al.add("(" + a + ", " + b + ")");
                al.add("(" + b + ", " + a + ")");
            } else {
                // Add the pair to the map
                map.put(a, b);
            }
        }
        return al;
    }
}
