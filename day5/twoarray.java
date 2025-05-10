package day5;
import java.util.Scanner;
import java.util.Arrays;

public class twoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of arrays
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Input elements for first array
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input elements for second array
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
