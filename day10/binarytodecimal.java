package day10;
import java.util.Scanner;

public class binarytodecimal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();

        int decimal = 0;
        int power = 0;

        // Loop from right to left
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            char bit = binaryStr.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);
        scanner.close();
    }
}
