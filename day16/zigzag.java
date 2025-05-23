package day16;
import java.util.*;

public class zigzag {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int n = sc.nextInt();

    System.out.print("Enter number of columns: ");
    int m = sc.nextInt();

    int[][] matrix = new int[n][m];
    int sum =0;
    int mid = m/2;


    // Input matrix elements
    System.out.println("Enter matrix elements:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

     for (int i = 0; i < n; i++) {
      if(i==0||i==n-1)
      {
        
        
          for (int j = 0; j < m; j++)
          {
         sum += matrix[i][j];

          } 
          
        }
        else 
        {
          sum += matrix[i][mid];
        }

       
      }
       System.out.println(sum);
    }
   
  

    
  }  

