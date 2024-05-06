import java.util.Scanner;
public class billCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        int[] items = new int[n];
        for(int i = 0 ;i<n;i++){
            items[i] = sc.nextInt();
        }
        int b= sc.nextInt();
        billCalc bc = new billCalc();
        String result = bc.billFunc(items,k,b);
        System.out.println(result);
    }
    public String billFunc(int[] items,int k,int b){
        int totalBill = 0;
        int over = 0;
        for(int i = 0; i < (items.length);i++){
            totalBill += items[i];
        }
        int actualBill = (totalBill - items[k])/2;
        if(actualBill==b){
            return "Bon Appetit";
        }else{
            over = b - actualBill;
            String overS = String.valueOf(over);
            return overS;
        }
    }
}
