import java.util.Scanner;
public class timeConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time12 = sc.nextLine();
        timeConvert tc = new timeConvert();
        String[] result = tc.conv24(time12);
        System.out.print(result[0] + ":" + result[1] + ":" + result[2]);
    }

    public String[] conv24(String t) {
        String time = t.substring(0, 8);
        String sign = t.substring(8, 10);
        String[] arr = time.split(":");
        String[] OutArrPM = new String[3];
        String timeString;
        int[] timeInt = new int[3];
        timeInt[0] = Integer.parseInt(arr[0]);
        if (sign.equals("PM")){
            if (timeInt[0] == 12) {
                timeInt[0] = 12;
            } else {
                timeInt[0] += 12;
            }
            timeString = String.valueOf(timeInt[0]);
            OutArrPM = new String[]{timeString, arr[1], arr[2]};
            return OutArrPM;


        } else if(sign.equals("AM")){
            if (arr[0].equals("12")) {
                arr[0] = "00";
            }
            return arr;

        } else {
            String[] error = {"ERROR","ERROR","ERROR"};
            return error;
        }
    }
}