import java.util.*;

public class Main {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = sc.nextInt();
       
        int[] cardPoints = new int[n];
        for(int i=0;i<n;i++){
            cardPoints [i] = sc.nextInt();
        }

        
       
       int res = maxScore(cardPoints ,k);

       
	    System.out.println(res);
         
     }
     
     public static int maxScore(int[] cardPoints, int k){
          // write your code here
        int n = cardPoints.length;
        int totalPoints = 0;

        // Calculate the total of the first k elements
        for (int i = 0; i < k; i++) {
            totalPoints += cardPoints[i];
        }

        // Initialize maxScore with totalPoints
        int maxScore = totalPoints;

        // Sliding window to include cards from the right end
        for (int i = 0; i < k; i++) {
            totalPoints = totalPoints - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            maxScore = Math.max(maxScore, totalPoints);
        }

        return maxScore; // Return the maximum score
    }


}
