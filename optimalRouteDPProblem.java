import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);	
	    int test = sc.nextInt();
	    while(test-->0){
            int n = sc.nextInt();
            int[] house = new int[n];
            for(int i=0; i<n; i++){
                house[i] = sc.nextInt();
            }
            System.out.println(optimalRoute(n,house));
        }
    }
	
    public static int solve(int[] arr, int start, int end) {
        int prev = arr[start];
        int prev2 = 0;
        
        for(int i = start + 1; i <= end; i++) {
            int pick = arr[i];
            if(i > start + 1)
                pick += prev2;
            int nonPick = prev;
            
            int curr = Math.max(pick, nonPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    
    public static int optimalRoute(int n, int[] house) {
        if(n == 1) return house[0];
        if(n == 2) return Math.max(house[0], house[1]);
        
        // Case 1: Consider houses from index 1 to n-1
        int ans1 = solve(house, 1, n-1);
        
        // Case 2: Consider houses from index 0 to n-2
        int ans2 = solve(house, 0, n-2);
        
        return Math.max(ans1, ans2);
    }
}
