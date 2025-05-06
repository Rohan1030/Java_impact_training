import java.util.*;
class  reverse {
  public static void main(String[] args)
  {
    System.out.print("Enter 3 digit no. :-");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int rev = 0;

   
      int lastdigit = num%10;
    
      int middledigit = (num/10)%10;
      int firstdigit = (num/100);

      rev = lastdigit*100 + middledigit*10 + firstdigit;
      

      
       
    
    System.out.print(rev);
    

    


  }
}