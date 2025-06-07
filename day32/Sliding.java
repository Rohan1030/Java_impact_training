package day32;
import java.util.*;
public class Sliding {
  public static void main(String[] args) {
    int[] arr = {5,7,2,3,4};
    int n = arr.length;
    Arrays.sort(arr);
    int sum =0;
    
    for(int i=n-3;i<n;i++)
    {
      sum += arr[i];
      System.out.println(arr[i]);
      
    }
    System.out.println(sum);

    



    
  }
  
}
