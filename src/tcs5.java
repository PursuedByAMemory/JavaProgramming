import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class tcs5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int size = sc.nextInt();
        System.out.println("Elements: ");
        int arr[] = new int[size];
        for(int i =0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        tcs5 tcs5 = new tcs5();
        HashMap<Integer,Integer> result = tcs5.tcs5Func(arr);
        for (int key : result.keySet()) {
            System.out.println(key + " occurs " + result.get(key) + " times in the array");
        }

    }
    public HashMap<Integer,Integer> tcs5Func(int arr[]){
        int count=0;
        boolean checked[] = new boolean[arr.length];
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }
        ArrayList<Integer> noDups = new ArrayList<>(hs);
        ArrayList<Integer> freq = new ArrayList<>();


        for(int i = noDups.size() - 1; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                if(noDups.get(j) > noDups.get(j+1)){
                    int temp = noDups.get(j);
                    noDups.set(j,noDups.get(j+1));
                    noDups.set(j+1,temp);
                }
            }
        }


        for(int i = arr.length-1; i > 0 ; i--){
            for(int j = 0 ; j < i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[ j+1];
                    arr[j+1] = temp;
                }
            }
        }



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
        HashMap<Integer, Integer> valFreq = new HashMap<>();
        for(int i = 0; i < noDups.size();i++){
            valFreq.put(noDups.get(i), freq.get(i));
        }
        return valFreq;
    }
}
