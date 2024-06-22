import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Which number to find?");
        int target = sc.nextInt();
        int index = 0;
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                isFound = true;
            }
        }
        if (isFound) {
            System.out.println("Successful! " + target + " was found at index " + index);
        } else {
            System.out.println(target + " not found");
        }
    }
}
