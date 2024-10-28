import java.util.*;

public class Main {
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         int[] arr = new int[n];
                for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
           if(checkSorted(arr,n))
               System.out.println("True");
           else 
                System.out.println("False");
         
     }
     
     public static boolean checkSorted(int[] arr, int n){
          // write your code here
        // Check if the array is sorted in non-decreasing order
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Found an element greater than the next one
            }
        }
        return true; // Array is sorted
    }

}
