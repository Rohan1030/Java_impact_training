package day29;
import java.util.*;

public class hashmap2 {
  public static void main(String[] args) {
    HashMap<Integer,Integer> obj = new HashMap<>();
    int arr[] ={1,4,4,5,6,3,4,5,6,7};
    for(int i=0;i<arr.length;i++)
    {
      if(obj.containsKey(arr[i]))
      {
        int count = obj.get(arr[i])+1;
        obj.put(arr[i],count);
      }
      else
      {
          obj.put(arr[i],1);
      }
      
    }
    System.out.println(obj);
  }
  
}
