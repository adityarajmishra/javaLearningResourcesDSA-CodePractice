import java.util.*;


public class Main {
    // NOTE: Please do not modify this function
   public static void main(String args[] ){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pairs= new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                pairs[i][j] = sc.nextInt();
            }
        }
        
        longestChain(pairs);

    }

    public static void longestChain(int[][] pairs) {
        // Step 1: Sort the pairs based on the second element (right)
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        // Step 2: Initialize variables to track the current chain end and length
        int currentEnd = Integer.MIN_VALUE;
        int chainLength = 0;

        // Step 3: Iterate through the sorted pairs
        for (int[] pair : pairs) {
            if (pair[0] > currentEnd) { // If the pair can be added to the chain
                currentEnd = pair[1]; // Update the end of the chain
                chainLength++; // Increment the chain length
            }
        }

        // Step 4: Print the length of the longest chain
        System.out.println(chainLength);
    }

}
