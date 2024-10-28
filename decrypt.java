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
           int[] res = decrypt(arr,k);
           for(int i:res)
             System.out.print(i+" ");
            System.out.println();
         
     }
     
    public static int[] decrypt(int[] code, int k) {
          // write your code here
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            // If k is 0, all elements in the result should be 0
            return result; // returns array filled with 0s
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                // Sum the next k elements
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n]; // Circular indexing with (i + j) % n
                }
            } else {
                // Sum the previous |k| elements
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n]; // Circular indexing with (i - j + n) % n
                }
            }
            result[i] = sum;
        }

        return result;
    }

}
