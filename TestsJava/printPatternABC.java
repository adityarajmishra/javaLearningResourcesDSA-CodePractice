import java.util.*;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLine = sc.nextInt(); 
        printPattern(inputLine);
    }

    public static void printPattern(int n) {
        //Write your code here
        // Iterate through each row
        for (int i = 0; i < n; i++) {
            // Start from the letter corresponding to 'n - i'
            char startChar = (char) ('A' + n - 1); // Calculate the starting character
            
            // Print characters for the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(startChar + " ");
                startChar--; // Move to the previous character
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
