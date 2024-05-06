import java.util.Scanner;
public class kangaroo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        kangaroo k = new kangaroo();
        String result = k.kanFunc(x1,v1,x2,v2);
        /*if(result = false){
            System.out.println("NO");
        }else if(result = true){
            System.out.println("YES");
        }*/
        System.out.println(result);
    }
    public String kanFunc(int x1, int v1, int x2, int v2){
        if(((x1 < x2) && (v1 < v2)) || ((x2<x1) && (v2 < v1))){
            return "NO";
        }
        else if((x1 - x2)%(v2-v1)==0){
            return "YES";
        } else{
            return "ERROR";
        }
    }
}
