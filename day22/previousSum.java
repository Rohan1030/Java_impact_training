package day22;
import java.util.*;

public class previousSum {

  public static void main(String[] args) {
    int count =10;
    for(int i=0;i<count;i++)
    {
      System.out.println(fibo(i) + " ");
    }

    

  }

  public static int fibo(int n )
  {
   if(n<=1)
   {
    return n;
   }
   return fibo(n - 1) + fibo(n - 2);
  }
}
 
  

