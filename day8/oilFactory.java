package day8;
import java.util.*;
public class oilFactory {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter digit : ");
    int n = sc.nextInt();


     //ArrayList<Integer> even = new ArrayList<>();
     //ArrayList<Integer> odd = new ArrayList<>();



    int[] arr = new int[n];

    System.out.println("Enter " + n+ " numbers:");
              for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
              }
              
              Arrays.sort(arr);
              int i=0;
              int j= n-1;
             

            while(i<j)
            {
              System.out.println(arr[j]+" "+arr[i]);
              i++;
              j--;
            }
            if(i==j)
            {
              System.out.println(arr[i]+ " 0");
            }
               
            

  }
  
}
