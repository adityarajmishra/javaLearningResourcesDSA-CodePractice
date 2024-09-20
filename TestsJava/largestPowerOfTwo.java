import java.util.*;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentValue = sc.nextInt();
        int ans = largestPowerOfTwo(currentValue);
        System.out.println(ans);
        
    }


    public static int largestPowerOfTwo(int n) {
        //Write your code here      
        if (n < 1) return 0; // Edge case handling for non-positive values
        
        int power = 0;
        while (n > 0) {
            n >>= 1; // Divide n by 2
            power++;
        }
        
        return power - 1; // Subtract 1 because the loop exits one step after exceeding
    }
}
