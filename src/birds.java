import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class birds {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        birds b = new birds();

        ArrayList<Integer> actualFreq = b.freqFunc(arr);
//        for(int i = 0; i < actualFreq.size(); i++){
//            System.out.println(actualFreq.get(i));
//        }

        //System.out.println("--------------------------------------------------------------------------");

        ArrayList<Integer> noDup = b.removeDuplicates(arr);
//        for(int p = 0; p < noDup.size();p++){
//            System.out.println(noDup.get(p));
//        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i< actualFreq.size();i++){
            hm.put(noDup.get(i), actualFreq.get(i));
        }
        System.out.println("---------------------------------------------------------------------------");


        System.out.println(hm);


    }




    public ArrayList<Integer> removeDuplicates(int arr[]){
        ArrayList<Integer> rdList = new ArrayList<>();
        ArrayList<Integer> correctOrder = new ArrayList<>();
        for(int i = arr.length-1; i>0; i--){
            if(arr[i]!=arr[i-1]){
                rdList.add(arr[i]);
            }
        }
        if(arr[0]!=arr[1]){
            rdList.add(arr[0]);
        }
        while(!rdList.isEmpty()){
            correctOrder.add(rdList.remove(rdList.size()-1));
        }
        return correctOrder;
    }



    public ArrayList<Integer> freqFunc(int arr[]){
        int count = 0;
        ArrayList<Integer> freq = new ArrayList<>();
        boolean checked[] = new boolean[arr.length];
        for(int i = 0;i<arr.length;i++){
            if(checked[i]){
                continue;
            }
            for(int j = i; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    checked[j] = true;
                }

            }
            freq.add(count);
            count = 0;
        }
    return freq;
    }

}
