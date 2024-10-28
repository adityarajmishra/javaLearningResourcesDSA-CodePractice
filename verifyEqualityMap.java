import java.util.*;

public class Main {
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         int[] arr1 = new int[n];
         int[] arr2 = new int[n];
         
         for(int i=0;i<n;i++){
             arr1[i] = sc.nextInt();
         }
         
         for(int i=0;i<n;i++){
             arr2[i] = sc.nextInt();
         }
         
         boolean ans = verifyEquality(arr1, arr2, n);
         if(ans) System.out.println("Equal");
         else System.out.println("Not Equal");
     }
     
     public static boolean verifyEquality(int[] A, int[] B, int N){
          // write your code here
    // Create frequency maps for both arrays
    Map<Integer, Integer> freqA = new HashMap<>();
    Map<Integer, Integer> freqB = new HashMap<>();
    
    // Count frequencies in array A
    for(int num : A) {
        freqA.put(num, freqA.getOrDefault(num, 0) + 1);
    }
    
    // Count frequencies in array B
    for(int num : B) {
        freqB.put(num, freqB.getOrDefault(num, 0) + 1);
    }
    
    // Compare the frequency maps
    return freqA.equals(freqB);
}

}

