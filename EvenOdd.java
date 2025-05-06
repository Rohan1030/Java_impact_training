import java.util.*;
public class EvenOdd {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 3 digit number : ");
      int num = sc.nextInt();
      if(num/2==0)
      {
        System.out.print("Even");
      }
      else 
      {
        System.out.println("Odd");
      }

      {
        if(1000<num )
        {
          System.out.println("Not a  3-digit number ");
        }
      }
  }
  
}
