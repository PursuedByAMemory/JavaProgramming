//import java.util.Scanner;
//import java.util.ArrayList;
//public class migratoryBirds {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i =0 ;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        migratoryBirds s = new migratoryBirds();
//        ArrayList<Integer> result = s.sockFunc(arr);
//        int min = 0;Stack<Character> stack = new Stack<>();
//        for(Integer ele : result){
//            //System.out.println(ele);
//            if(ele > 1){
//                min = ele;
//                if(min>ele){
//                    min=ele;
//                }
//            }
//        }
//        System.out.println(min);
//    }
//    public ArrayList<Integer> sockFunc(int[] arr){
//        int count = 0;
//        ArrayList<Integer> al = new ArrayList<>();
//        boolean[] counted = new boolean[arr.length];
//        for(int i =0;i<arr.length;i++){
//            if(counted[i]){
//                continue;
//            }
//
//            for(int j = i; j < arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                    counted[j] = true;
//                }
//            }
//            al.add(count);
//            count = 0;
//        }
//        return al;
//    }
//}