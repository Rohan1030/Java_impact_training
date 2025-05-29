package day21;
import java.util.Scanner;
public class prime {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    prime(n);
    sc.close();
    
  }

  public static void prime(int n ) {
    if (n < 2) {
      System.out.println("Not a prime number");
      return;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.println("Not a prime number");
        return;
      }
    }
    System.out.println("Prime number");
    
  }


  
}
