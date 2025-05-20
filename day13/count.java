package day13;
import java.util.*;
public class count {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = sc.nextLine();

    int count =0;
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if(ch =='a' || ch == 'A')
      {
        count++;
      }

      



      
   
  }
  System.out.println(count );
  
}
}
