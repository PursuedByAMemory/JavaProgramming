import java.util.Scanner;
public class buubleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values are there dude?");
        int n = sc.nextInt();
        System.out.println("Type the values in a space separated line lad");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        buubleSort b = new buubleSort();

        b.bSort(arr);
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public void bSort(int[] arr){
        for(int i = (arr.length-1);i>0;i--){
            for(int j = 0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
