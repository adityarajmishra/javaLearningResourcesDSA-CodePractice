import java.util.*;

class Main{
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         int[] arr = new int[n];
                for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
        int res = findMaxConsecutiveOnes(arr);
        System.out.println(res);
         
     }
     
     public static int findMaxConsecutiveOnes(int[] arr){
          // write your code here
        int maxCount = 0;
        int currentCount = 0;

        for (int num : arr) {
            if (num == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        // Final comparison for a streak of 1's at the end
        maxCount = Math.max(maxCount, currentCount);

        return maxCount;
    }

}
