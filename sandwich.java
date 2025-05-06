import java.util.*;
public class sandwich {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 3 digit number : ");
    int num = sc.nextInt();
    

    if(num>=100 && num<1000)
    {
        int miiddiledigit = (num/100)%10;
        if(miiddiledigit%3==0)
        {
          System.out.println("Trendy number ");
        }
        else 
        {
          System.out.println("Not a trendy Number");
        }

    }

    else {
      System.out.println("Invalid Number300");
    }
     nn
  }
  
}
