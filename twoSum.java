import java.util.*;

public class Main {
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int target = sc.nextInt();
     
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

		int[] ans  = twoSum(arr, target);
        System.out.println(ans[0]+" "+ans[1]);
         
     }
     
     public static int[] twoSum(int[] arr, int target){
          // write your code here
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                // Return 1-based indices
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // Return null if no solution is found
        return null;
    }

}
