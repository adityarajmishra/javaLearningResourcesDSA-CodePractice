import java.util.*;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLine = sc.nextInt(); 
        int ans = findPosition(inputLine);
        System.out.println(ans);
    }

    public static int findPosition(int N) {
        // Check if N is 0 or if it has more than one set bit
        if (N <= 0 || (N & (N - 1)) != 0) {
            return -1;
        }

        // Find position of the single set bit
        int position = 1;
        while ((N & 1) == 0) {
            N >>= 1;
            position++;
        }
        return position;
    }
}
