package day26;
import java.util.*;

// Polymoprphism

class operations 
{
  int add(int a , int b)

  {
    return a+b;
  }
  double add(double a , double b)
  {
    return a+b;
  }
}


public class Polymorphism {
  public static void main(String[] args) {
    operations obj=new operations();
    System.out.println(obj.add(5,3));



}
}