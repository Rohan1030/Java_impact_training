package day27;
import java.util.*;
class Circle 
{
  private double radius;
  public Circle(double radius)
  {
    this.radius=radius;

  }
  public double getRadius()
  {
    return radius;

  }
  public void setRadius(double radius)
  {
    if(radius>0)
    {
      this.radius = radius;
    }
    else 
    {
      System.out.println("enter positive no");
    }
  } 

  public double calculateArea()
  {
    return Math.PI*radius*radius;
  }
}

public class circle {
  public static void main(String[] args) {
    
  }
  
  
}
