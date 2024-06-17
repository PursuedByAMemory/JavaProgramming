import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
public class tcs15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        tcs15 tcs15 = new tcs15();
        HashMap<Integer, Integer> result = tcs15.tcs15Func(arr);
        //ArrayList<Integer> finalOutput = new ArrayList<>();
        int max = 0;
        for(int key: result.keySet()){
            System.out.println(key+": "+ result.get(key));
        }


    }





    public HashMap<Integer, Integer> tcs15Func(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = arr.length -1; i > 0; i--){
            for(int j = 0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            al.add(arr[i]);
        }
        int count = 0;
        LinkedHashSet<Integer> hs= new LinkedHashSet<>(al);
        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }
        ArrayList<Integer> noDups = new ArrayList<>(hs);
        ArrayList<Integer> freq = new ArrayList<>();
        boolean checked[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
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
        HashMap<Integer, Integer> noDupsFreq = new HashMap<>();
        for(int i =0; i < noDups.size(); i++){
            noDupsFreq.put(noDups.get(i), freq.get(i));
        }
        return noDupsFreq;
    }
}
