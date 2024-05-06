import java.util.Scanner;
public class AppleOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] appArr = new int[m];
        for (int i = 0; i < m; i++) {
            appArr[i] = sc.nextInt();
        }
        int[] oraArr = new int[n];
        for (int i = 0; i < n; i++) {
            oraArr[i] = sc.nextInt();
        }
        AppleOrange ao = new AppleOrange();
        int[] result = ao.countApplesAndOranges(s, t, a, b, appArr, oraArr);
        for(int i = 0; i < (result.length);i++){
            System.out.println(result[i]);
        }
    }

    public int[] countApplesAndOranges(int s, int t, int a, int b, int appArr[], int oraArr[]) {
        int[] actualappD = new int[appArr.length];
        int[] actualoraD = new int[appArr.length];
        for (int i = 0; i < (appArr.length); i++) {
            actualappD[i] = (appArr[i] + a);
        }
        for (int i = 0; i < (oraArr.length); i++) {
            actualoraD[i] = (oraArr[i] + b);
        }
        int appCount = 0;
        int oraCount = 0;
        for (int i = 0; i < (actualappD.length); i++) {
            if ((s <= actualappD[i]) && (actualappD[i] <= t)) {
                appCount += 1;
            }
        }
        for (int i = 0; i < (actualoraD.length); i++) {
            if ((s <= actualoraD[i]) && (actualoraD[i] <= t)) {
                oraCount += 1;
            }
        }
        int[] outVals = {appCount,oraCount};
        return outVals;
    }
}