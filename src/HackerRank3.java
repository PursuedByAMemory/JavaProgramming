import java.util.Scanner;
public class HackerRank3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inLine1 = sc.nextLine();
        String[] split = inLine1.split("\\s+");
        int[] a = new int[3];
        for(int i = 0; i < 3 ; i++){
            a[i] = Integer.parseInt(split[i]);
        }
        String inLine2 = sc.nextLine();
        String[] split2 = inLine2.split("\\s+");
        int[] b = new int[3];
        for(int j = 0; j < 3; j++){
            b[j]=Integer.parseInt(split2[j]);
        }
        int[] result = {0,0};
        for(int p = 0;p < 3; p++){
            if(a[p]>b[p]){
                result[0]=result[0]+1;
            }
            else if(a[p]<b[p]){
                result[1]=result[1]+1;
            }
        }
        System.out.println(result[0] + " " + result[1]);
    }
}
