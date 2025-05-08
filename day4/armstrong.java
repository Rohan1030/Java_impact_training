package day4;
import java.util.*;
public class armstrong {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number : ");
      int n = sc.nextInt();

    int original = n;
     int sum=0;
     int digit = 0;
     int temp = n;
     while(temp!=0)
     {
      temp = temp/10;
      digit++;

     }


     while(n!=0)
     {
      int r = n%10;
      n = n/10;
      sum += Math.pow(r,digit);

     }

     if(sum==original)
     {
      System.out.println("Number is armstrong");
     }
     else 
     {
      System.out.println("Not a armstrong number");
     }





  }
  
}
