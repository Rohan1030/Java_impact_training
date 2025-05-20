package day13;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.nextLine();

        // Normalize string
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string manually using append()
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));  // build reversed string
        }

        // Convert StringBuilder to String
        String reversedStr = reversed.toString();

        // Compare
        if (str.equals(reversedStr)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        sc.close();
    }
}
