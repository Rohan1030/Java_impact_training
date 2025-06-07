package day29;
import java.util.*;
public class hashmap {
  public static void main(String[] args) {
    
    HashMap<Integer,String> obj = new HashMap<>();
    obj.put(1,"Rohan");
    obj.put(2,"Kamlesh");
    System.out.println(obj);
    System.out.println(obj.get(2));
    System.out.println(obj.remove(1));
    System.out.println(obj.containsKey(1));
    System.out.println(obj.containsValue("Rohan"));
    for(int i:obj.keySet())
    {
      System.out.println("Each key"+i+ "<-->"+obj.get(i));
    }
  }
  
}
