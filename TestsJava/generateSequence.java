import java.util.*;
public class Main
{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
         
    }
    
    public static void solve(int n){                
	    // write your code here                
        generateSequence(n, n, true);
    }

    public static void generateSequence(int current, int original, boolean decreasing) {
        System.out.print(current + " ");
        if (decreasing) {
            if (current <= 0) {
                generateSequence(current + 5, original, false);
            } else {
                generateSequence(current - 5, original, true);
            }
        } else {
            if (current == original) {
                return;
            } else {
                generateSequence(current + 5, original, false);
            }
        }
    }
}
