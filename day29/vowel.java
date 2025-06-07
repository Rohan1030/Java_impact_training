package day29;
import java.util.*;

public class vowel {
  public static void main(String[] args) {
    HashMap<Character,Integer> obj = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String : ");
    String str = sc.nextLine();
    
    str = str.toLowerCase();
    for(int i=0;i<str.length();i++)
    {
      char ch = str.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
          if(obj.containsKey(ch))
          {
            obj.put(ch,obj.get(ch)+1);
          }
          else 
          {
            obj.put(ch,1);
          }
      }
    }
      System.out.println(obj);

  }
  
}
