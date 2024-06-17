import java.util.*;

public class FrequencyProg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array?");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter the "+i+"th element: ");
            arr[i] = sc.nextInt();
        }
        FrequencyProg fp = new FrequencyProg();
        HashSet<Integer> key = fp.keyFunc(arr);
        ArrayList<Integer> alKey = new ArrayList<>(key);
        ArrayList<Integer> val = fp.valFunc(arr);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < key.size();i++){
            hm.put(alKey.get(i),val.get(i));
        }
        System.out.println(hm);
    }
    public HashSet<Integer> keyFunc(int arr[]){
        for(int i = arr.length-1; i > 0 ;i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        HashSet<Integer> distinct = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            distinct.add(arr[i]);
        }
        return distinct;
    }

    public ArrayList<Integer> valFunc(int[] arr){
        for(int i = arr.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        int count=0;
        boolean checked[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(checked[i]){
                continue;
            }
            for(int j = i; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    count = count + 1;
                    checked[j] = true;
                }
            }
            al.add(count);
            count = 0;
        }
        return al;
    }
}