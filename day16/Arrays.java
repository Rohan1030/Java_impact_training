package day16;
import java.util.*;

public class Arrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter matrix : ");
    int n = sc.nextInt();

    int[][] matrix = new int[n][n];

    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      { matrix[i][j]= sc.nextInt();

      }
    }

    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      { 
        System.out.print(matrix[j][i]+" ");

      }
      System.out.println();
    }

    
  }
}
