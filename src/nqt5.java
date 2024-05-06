import java.util.Scanner;
public class nqt5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nqt5 n5 = new nqt5();
        int result = n5.nqt5Func(n);
        System.out.println(result);
    }
    public int nqt5Func(int n){
        String val = Integer.toString(n);
        int arr[] = new int[val.length()];
        for(int i = 0; i < val.length(); i++){
            arr[i]=Integer.parseInt(String.valueOf(val.charAt(i)));
        }
        int pro = 1;
        for(int i = 0; i < arr.length;i++){
            pro = pro * arr[i];
        }
        return pro;
    }
}
