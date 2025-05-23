package day16;
import java.util.*;

public class games {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Number : ");
  String a = sc.nextLine();
  int sum =0;

  for(int i=0;i<a.length();i++)
  {
    char ch = a.charAt(i);
   if(Character.isDigit(ch))
   {
    sum += ch-'0';
   }

  }

  System.out.println(sum);



  


}  
}
