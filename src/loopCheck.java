/*public class loopCheck {
    public static void main(String[] args){
        int len = 5;
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<2;i++){
            int lastTemp = arr[len-1];
            int zeroVal = arr[len-len]; // 0 index
            int oneVal = arr[len-(len-1)]; //5-(5-1) = 1 index
            int twoVal = arr[len-(len-2)]; //5-(5-2) = 2 index
            int thirdVal = arr[len-(len-3)]; //5-(5-3) = 3 index
            int fourVal = arr[len-(len-4)]; //5-(5-4) = 4 index
            arr[1]=zeroVal;
            arr[2]=oneVal;
            arr[3]=twoVal;
            arr[4]=thirdVal;
            arr[0]=lastTemp;
        }
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
    }
}*/
public class loopCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int len = arr.length;
        int rotations = 2;
        for (int i = 0; i < rotations; i++) {
            int lastTemp = arr[len - 1]; // Store the last element temporarily
            // Perform the cyclic shift
            for (int j = len - 1; j > 0; j--) {
                arr[j] = arr[j - 1]; // Shift each element one position to the right
            }
            arr[0] = lastTemp; // Move the last element to the first position
        }

        // Print the updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
