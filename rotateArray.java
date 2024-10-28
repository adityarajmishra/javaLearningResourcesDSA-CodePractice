import java.util.*;

public class Main {
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int[] arr = new int[n];
                for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
        rotateArray(arr,n);
        
        for(int i:arr)System.out.print(i+" ");
        System.out.println();
         
     }
     
     public static void rotateArray(int[] arr, int N ){
          // write your code here
         if (N <= 1) return; // No rotation needed for arrays with 1 or fewer elements

        int firstElement = arr[0]; // Step 1: Store the first element

        // Step 2: Shift all elements to the left by one position
        for (int i = 0; i < N - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Step 3: Place the first element at the end of the array
        arr[N - 1] = firstElement;
    }

}
