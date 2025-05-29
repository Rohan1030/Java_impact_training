package day22;

public class powerRecursive {

    public static double power(double num, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return num * power(num, n - 1);
        } else {
            // for negative power, use reciprocal
            return 1 / power(num, -n);
        }
    }

    public static void main(String[] args) {
        double num = 4;
        int n = 2;

        double result = power(num, n);
        System.out.println(num + "^" + n + " = " + result);
    }
}
