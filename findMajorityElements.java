import java.util.*;

public class Main {
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
           
         int[] arr = new int[n];
                for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
      int res =  findMajorityElements(arr,n );
      System.out.println(res);
        
         
     }
     
     public static int findMajorityElements(int[] arr, int N ){
          // write your code here
        int count = 0;
        int candidate = -1;
        
        // Finding candidate for majority element
        for (int i = 0; i < N; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        // Verify if candidate is actually a majority element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        
        return count > N / 2 ? candidate : -1; // Return -1 if no majority element
    }

}
