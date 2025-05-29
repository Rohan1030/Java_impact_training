package day22;
import java.util.*;

class parent {

void display()
{
  System.out.println("Parent class");
}

}
class Child extends parent 
{
  void show()
  {
    System.out.println("Child class");
  }
}

public class Oops
{
  public static void main(String[] args) {
    Child obj = new Child();
    obj.display();
    obj.show();


    
  }
}

