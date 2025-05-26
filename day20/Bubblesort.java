package day20;
import java.util.*;

public class Bubblesort {

    public static void bubblesort(int[] arr) {
        int n = arr.length;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            // If no swaps occurred, the array is already sorted
            if (!swap)
                break;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {52, 64, 10, 7, 96};

        System.out.println("Before Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubblesort(numbers);

        System.out.println("\nAfter Sort:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
