import java.util.*;

public class Main {
    public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);	
	 	int n = sc.nextInt();
	 	int[] prices = new int[n];
	 	for(int i=0; i<n; i++){
		prices[i] = sc.nextInt();
}
System.out.println(function(n,prices));
}
	public static int function(int n, int[] prices){
	//Write your code here
        if (n == 0) return 0;

        int[] sell = new int[n];     // Max profit if we sell on day i
        int[] buy = new int[n];      // Max profit if we buy on day i
        int[] cooldown = new int[n]; // Max profit if we are in cooldown on day i

        // Initial state
        buy[0] = -prices[0]; // Buying on the first day
        sell[0] = 0;         // No profit on the first day if not selling
        cooldown[0] = 0;     // Cooldown is 0

        for (int i = 1; i < n; i++) {
            // Sell on day i (buy before)
            sell[i] = buy[i - 1] + prices[i];
            // Buy on day i (can only come from a cooldown)
            buy[i] = Math.max(buy[i - 1], cooldown[i - 1] - prices[i]);
            // Cooldown on day i (can either be from sell or continue in cooldown)
            cooldown[i] = Math.max(cooldown[i - 1], sell[i - 1]);
        }

        // The maximum profit will be the best option on the last day: either sell or stay in cooldown
        return Math.max(sell[n - 1], cooldown[n - 1]);
    }
	
}
