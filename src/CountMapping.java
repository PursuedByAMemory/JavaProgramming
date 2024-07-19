import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class CountMapping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size?");
        int s = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[s];
        for(int i = 0; i < s; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        CountMapping cm = new CountMapping();
        ArrayList<Integer> key = cm.keyFunc(arr);
        ArrayList<Integer> val = cm.countFunc(arr);
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int i = 0; i < key.size(); i++){
            countMap.put(key.get(i),val.get(i));
        }
        System.out.println("Item = Frequency");
        System.out.println(countMap);

        System.out.println("Distinct items are: ");
        for(int k : countMap.keySet()){
            if(countMap.get(k)==1){
                System.out.println(countMap.get(k));
            }
        }
        System.out.println("Repetitive items are: ");
        for(int k : countMap.keySet()){
            if(countMap.get(k)>1){
                System.out.println(countMap.get(k));
            }
        }
    }
    public ArrayList<Integer> keyFunc(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i < arr.length; i++){
            hs.add(arr[i]);
        }
        ArrayList<Integer> keyList = new ArrayList<>(hs);
        return keyList;
    }
    public ArrayList<Integer> countFunc(int arr[]){
        ArrayList<Integer> countList = new ArrayList<>();
        int count = 0;
        boolean checked[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(checked[i]){
                continue;
            }
            for(int j = i; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    checked[j] = true;
                }
            }
            countList.add(count);
            count=0;
        }
        return countList;
    }
}
