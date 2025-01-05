import java.util.*;

public class Main {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);	
        int n = sc.nextInt();
        int[] cost = new int[n];
        for(int i=0; i<n; i++)cost[i] = sc.nextInt();

        System.out.println(cheapestWay(n,cost));
    }
	
    public static int cheapestWay(int n, int[] cost) {
        // Edge cases: if there are no stairs or only one step
        if (n == 0) return 0;
        if (n == 1) return cost[0];

        // DP array to store the minimum cost to reach each step
        int[] dp = new int[n];

        // Base cases
        dp[0] = cost[0];
        dp[1] = cost[1];

        // Fill the DP array
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        // The minimum cost to pass the last step is the smaller of the last two steps
        return Math.min(dp[n - 1], dp[n - 2]);
    }

}
