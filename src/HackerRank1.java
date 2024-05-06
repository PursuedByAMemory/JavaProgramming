import java.util.*;
public class HackerRank1 {
    public static void main(String[] args){ int[] org = new int[] {1, 2 ,3};

        System.out.println("Original Array");
        for (int i = 0; i < org.length; i++)
            System.out.print(org[i] + " ");

        // copying array org to copy
        int[] copy = Arrays.copyOf(org, 5);

        // Changing some elements of copy

        System.out.println("\nNew array copy after modifications:");
        for (int i = 0; i < copy.length; i++)
            System.out.print(copy[i] + " ");
    }
}
