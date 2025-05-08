import java.util.*;
public class weird {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter no. : ");
    int n = sc.nextInt();


    if(n%2==0)
    {
      if(n<=2 && n>=5)
      {
        System.out.println("Not Weird");
      }
      else if (n>=6 && n<=20)
      {
        System.out.println("Weird");
      }
      else if(n>20)
      {
        System.out.println("not weird");
      }
    }
    else 
    {
      System.out.println("weird");
    }



    
  }
  
}
