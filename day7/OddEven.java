package day7;
import java.util.*;
public class OddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.print("Enter digit : ");
              int n = sc.nextInt();


              int[] arr = new int[n];
              int odd_sum=0;
              int even_sum=0;

              System.out.println("Enter " + n + " numbers:");
              for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
              }
              

              for(int i=0;i<n;i++)
              {
                if(arr[i]%2==0)
                {
                  even_sum = even_sum+arr[i];
                }
                  
                else{
                  odd_sum = odd_sum + arr[i];
                 
                }
              }
              
          
                System.out.println(even_sum);
                System.out.println(odd_sum);

    
  }
  
}
