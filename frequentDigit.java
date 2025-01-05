import java.util.*;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = frequentDigit(s);
        System.out.println(ans);

    }


   private static String frequentDigit(String N) {
        // Array to count the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Iterate through the string and count digit occurrences
        for (char c : N.toCharArray()) {
            frequency[c - '0']++;
        }

        // Find the digit with the highest frequency
        int maxFrequency = 0;
        int resultDigit = 0;

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > maxFrequency || (frequency[i] == maxFrequency && i > resultDigit)) {
                maxFrequency = frequency[i];
                resultDigit = i;
            }
        }

        // Return the result as a string
        return String.valueOf(resultDigit);
    }
}
