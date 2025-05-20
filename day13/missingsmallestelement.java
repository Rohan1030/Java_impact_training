package day13;
import java.util.*;

public class missingsmallestelement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Character : ");
    String str = sc.nextLine();

    for(char ch = 'a';ch<='z';ch++)
    {
      if(str.indexOf(ch)==-1)
      {
        System.out.println(ch);
        break;
      }
    }
    

  }
  
}
