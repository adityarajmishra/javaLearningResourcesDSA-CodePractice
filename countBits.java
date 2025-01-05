import java.util.*;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLine = sc.nextInt(); 
        int ans = countBits(inputLine);
        System.out.println(ans);
    }

    public static int countBits(int N) {
        int count = 0;
        while (N > 0) {
            // Check the least significant bit
            count += N & 1;
            // Right shift N by 1 to check the next bit
            N >>= 1;
        }
        return count;
    }
}
