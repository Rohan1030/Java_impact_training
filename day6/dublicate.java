      package day6;
      import java.util.*;

      public class dublicate {
          public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

              System.out.print("Enter size of array: ");
              int n = sc.nextInt();
              int[] arr = new int[n];

              // Input elements
              System.out.println("Enter array elements:");
              for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
              }

              boolean found = false;
              System.out.println("Duplicate numbers and their indices:");
              for (int i = 0; i < n; i++) {
                  for (int j = i + 1; j < n; j++) {
                      if (arr[i] == arr[j]) {
                          System.out.println("Duplicate number: " + arr[i] + " found at indices " + i + " and " + j);
                          found = true;
                      }
                  }
              }

              if (!found) {
                  System.out.println("No duplicates found.");
              }

              sc.close();
          }
      }
