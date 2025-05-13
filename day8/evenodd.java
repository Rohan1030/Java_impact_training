package day8;
import java.util.*;
public class evenodd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter digit : ");
    int n = sc.nextInt();


     ArrayList<Integer> even = new ArrayList<>();
     ArrayList<Integer> odd = new ArrayList<>();



    int[] arr = new int[n];

    System.out.println("Enter " + n+ " numbers:");
              for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
              }
              
              for(int i=0;i<n;i++)
              {
                if(arr[i]%2==0)
                {

                   even.add(arr[i]);

                }
                else 
                {
                  odd.add(arr[i]);
                }
                
              }
               even.addAll(odd);

               System.out.println("Numbers (even first, then odd): " + even);

  }
  
}
