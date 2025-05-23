package day16;
import java.util.*;

      public class company{

          
          public static void main(String[] args) {
          
              Scanner sc=new Scanner(System.in);
              String ency=sc.nextLine();
              char[] digit=ency.toCharArray();
              
              for(int i=0;i<digit.length-1;i+=2){
                  char temp=digit[i];
                  digit[i]=digit[i+1];
                  digit[i+1]=temp;
              }
              String decy=new String(digit);
              System.out.println(decy);
    }
}