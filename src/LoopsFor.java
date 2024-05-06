import java.util.ArrayList;
public class LoopsFor {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int segSize=2;
        ArrayList<Integer> al = new ArrayList<>();
        //Stop loop from accessing out of bound elements when splitting arr
        for(int i = 0; i<(arr.length - segSize);i++){
            //System.out.println(arr[i]);
            int sum = 0;
            for(int j = i;j<i+segSize;j++){
                sum+=arr[j];
            }

            al.add(sum);
        }
        for(int val: al){
            System.out.println(val);
        }
    }
}