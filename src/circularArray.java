import java.util.Scanner;
public class circularArray {
    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        int q = 0;
        Scanner sc = new Scanner(System.in);
        String[] in1arr = new String[3];
        int[] in1arrCon = new int[3];
        String in1 = sc.nextLine();
        String in2 = sc.nextLine();
        in1arr = in1.split("\\s+");
        for (int i = 0; i < 3; i++) {
            in1arrCon[i] = Integer.parseInt(in1arr[i]);
        }
        for (int i = 0; i < 3; i++) {
            n = in1arrCon[0];
            k = in1arrCon[1];
            q = in1arrCon[2];
        }


        String[] in2arr = new String[n];
        in2arr = in2.split("\\s+");
        int[] in2arrCon = new int[n];
        for (int i = 0; i < n; i++) {
            in2arrCon[i] = Integer.parseInt(in2arr[i]);
        }
        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }
        circularArray ca = new circularArray();
        int[] result = ca.rotationFunc(in2arrCon, k, queries);
        for (int i = 0; i < queries.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] rotationFunc(int[] arrToR, int rCount, int[] indices) {
        int len = arrToR.length;
        int rotations = 2;
        for (int i = 0; i < rotations; i++) {
            int lastTemp = arrToR[len - 1]; // Store the last element temporarily
            // Perform the cyclic shift
            for (int j = len - 1; j > 0; j--) {
                arrToR[j] = arrToR[j - 1]; // Shift each element one position to the right
            }
            arrToR[0] = lastTemp; // Move the last element to the first position
        }
        /*
        int len = arrToR.length;
        int temp = arrToR[len - 1];
        for (int i = 0; i < rCount; i++) {
            arrToR[i+1] = arrToR[i];
        }
        */
        return arrToR;
    }
}