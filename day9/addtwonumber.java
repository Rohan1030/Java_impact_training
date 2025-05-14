package day9;
import java.util.*;

class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of digits in array 1: ");
        int n = sc.nextInt();
        int[] a1 = new int[n];
        System.out.print("Enter digits of array 1: ");
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();  // ✅ Fixed
        }

        System.out.print("Number of digits in array 2: ");
        int m = sc.nextInt();
        int[] a2 = new int[m];
        System.out.print("Enter digits of array 2: ");
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextInt();
        }

        // Result can have at most max(n, m) + 1 digits
        int[] result = new int[Math.max(n, m) + 1];

        int i = n - 1;
        int j = m - 1;
        int k = result.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? a1[i] : 0;
            int digit2 = (j >= 0) ? a2[j] : 0;

            int sum = digit1 + digit2 + carry;
            result[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        // Print result, skipping leading zero if it's 0
        System.out.print("Sum: ");
        boolean leadingZero = result[0] == 0;
        for (int idx = (leadingZero ? 1 : 0); idx < result.length; idx++) {
            System.out.print(result[idx]);
        }

        System.out.println();
    }
}
