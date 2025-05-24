package day17;
import java.util.*;
class code 
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter matrix size : ");
    int n = sc.nextInt();

    int[][] matrix = new int[n][n];

    for(int i=0;i<matrix.length;i++)
    {
      for(int j=0;j<matrix.length;j++)
      {
          matrix[i][j] = sc.nextInt();
      }
      
    }

    for(int i=0;i<matrix.length;i++)
    {
      for(int j=0;j<matrix.length;j++)
      {
        int temp = matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i] = temp;

      }
    }

    for(int i=0;i<matrix.length;i++)
    {
      for(int j=0;j<matrix.length/2;j++)
      {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix.length-1-j];
        matrix[i][matrix.length-1-j] =temp;
      }
    }

    for(int i=0;i<matrix.length;i++)
    {
      for(int j=0;j<matrix.length;j++)
      {
          System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }

    


  
    
  }
}
