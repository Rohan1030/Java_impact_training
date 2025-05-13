package day8;
import java.util.*;

public class smallespositive {
  public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);

    System.out.print("Enter Digit : ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }


    Arrays.sort(arr);

        int num =1;

      for(int i=0;i<n;i++)
      {
        if(num == arr[i])
        {
          num++;
        }
      }

      System.out.println(num);
      

  }
  
}
