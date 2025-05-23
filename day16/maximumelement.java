package day16;
import java.util.*;

public class maximumelement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int row = sc.nextInt();
     int col = sc.nextInt();
    int[][] matrix = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
      int  great =  Math.max(matrix[row],matrix[col]);
      }
    }
    
  }
  
}
