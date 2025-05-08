package day4;
import java.util.*;
public class kaprekar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter digit : ");
    int num = sc.nextInt();
    int count = 0;
    int sq = num*num;
    int temp = num;

    while(num!=0)
    
      {
        
         num/=10;
        count++;
       }

       int power = (int) Math.pow(10,count);
       int right = sq%power;
       int left = sq/power;

       if((left + right)==temp)
       {
          System.out.println("kaprekar Number");
       }
       else 
       {
        System.out.println("Not a kaprekar number");
       }



       
  }



  
}
