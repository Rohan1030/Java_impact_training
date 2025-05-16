package day10;
import java.util.*;
public class secondmaxelement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 30, 30};

        // Initialize max and second max
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found.");
        } else {
            System.out.println("Second maximum: " + secondMax);
        }
    }
}
