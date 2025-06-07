package day31;
import java.util.*;
public class songs {
  public static void main(String[] args) {
    int arr[] = {7,14,21,19,17,2,29,5};
    int n=arr.length;
    int count=0;
       int target=40;
    
    for(int i=0;i<n;i++)
    {
      HashSet<Integer> hs=  new HashSet<>();
      int temp=target-arr[i];
      for(int j=i+1;j<n;j++)
      {
        if(hs.contains(temp-arr[i]))
        {
          count++;
        }
        else 
        {
            hs.add(arr[j]);
        }
      }
        System.out.println(hs);
     
    }
   
 


    
  }
  
}
