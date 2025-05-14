package day9;
import java.util.*;

 class oddeventogether{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Size of array : ");
    int n = sc.nextInt();

    System.out.print("Array of element : ");
    int array[] = new int[n];

    for(int i=0;i<n;i++)
    {
      array[i] = sc.nextInt();
    }

    int left =0;
    int right =n-1;
    while(left<right)
    {
      if(array[left]%2==0)
      {
        left++;
        
      }
else if(array[right] % 2!=0)
{
  right --;
}
else 
{
  int temp = array[left];
  array[left] = array[right];
  array[right] = temp;
  left++;
  right--;
}
    }


    System.out.println("Array After Swapping");
    for(int i=0;i<n;i++)
    {
      System.out.print(array[i]+ " ");
    }
  }

}
