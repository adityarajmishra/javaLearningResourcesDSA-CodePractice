import java.util.*;

public class Main {
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         int k = sc.nextInt(); 
 	 
         int[] arr = new int[n];
           for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
           
         System.out.println(minimumDifference(arr,k));
         
     }
     
    public static int minimumDifference(int[] arr, int k) {
          // write your code here
        if (k == 1) return 0; // Minimum difference is 0 if only one element is selected

        Arrays.sort(arr); // Sort the array to easily access k consecutive elements
        int minDifference = Integer.MAX_VALUE;

        // Slide a window of size k through the sorted array
        for (int i = 0; i <= arr.length - k; i++) {
            int currentDifference = arr[i + k - 1] - arr[i]; // Difference between max and min in this window
            minDifference = Math.min(minDifference, currentDifference); // Update the minimum difference found
        }

        return minDifference;
    }

}

