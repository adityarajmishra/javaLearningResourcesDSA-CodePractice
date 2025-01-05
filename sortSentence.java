import java.util.*;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();

        String ans = sortSentence(inputLine);
        System.out.println(ans);
    }

    public static String sortSentence(String s) {
        // Split the input sentence into words
        String[] words = s.split(" ");

        // Create an array to store the words in their correct positions
        String[] sortedWords = new String[words.length];

        // Iterate through each word
        for (String word : words) {
            // Extract the position from the word (last character)
            int position = word.charAt(word.length() - 1) - '0';

            // Remove the digit and place the word in its correct position
            sortedWords[position - 1] = word.substring(0, word.length() - 1);
        }

        // Join the sorted words into a single sentence
        return String.join(" ", sortedWords);
    }
}
