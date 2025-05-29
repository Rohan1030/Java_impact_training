package day22;
import java.util.*;
public class recursive {
  public static void main(String[] args) {
    int num =10;
    long result=fact(num);
    System.out.println("Factorial is " +result);

    
  }

  public static long fact(int n )
  {
    if(n==0 |n==1)
    {
      return 1;
    }
    return n*fact(n-1);
  }

  
}
