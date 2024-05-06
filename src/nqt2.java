import java.util.Scanner;
import java.util.ArrayList;
public class nqt2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int nd = sc.nextInt();

        ArrayList<String> al = new ArrayList<>();
        al.add("mon");
        al.add("tue");
        al.add("wed");
        al.add("thu");
        al.add("fri");
        al.add("sat");
        al.add("sun");
        int count = 0;
        for(int i = 0; i < 7;i++){
            count++;
            if(day.equals(al.get(i))){
                break;
            }
        }
        int daysLeft = nd - count;
        int nSun = (daysLeft/7) + 1;
        System.out.println(nSun);
    }
}