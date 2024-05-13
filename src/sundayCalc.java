import java.util.Scanner;
import java.util.ArrayList;

public class sundayCalc {
    public static void main(String[] args){
        String arr[] = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        Scanner sc = new Scanner(System.in);
        int dayIndex = 0;
        String day = sc.nextLine();
        int nOfDays = sc.nextInt();
        int daysToSun;
        for(int i = 0; i<7;i++){
            if(arr[i].equals(day)){
                dayIndex = i+1;
            }
        }
        daysToSun = 7 - dayIndex;
        if(daysToSun > nOfDays){
            System.out.println(0);
        }else {
            int n0fSun = (nOfDays - daysToSun) / 7;
            System.out.println(n0fSun + 1);
        }
    }
}
