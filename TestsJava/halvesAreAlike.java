import java.util.*;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        boolean ans = halvesAreAlike(inputLine);
        if (ans) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }

    public static Boolean halvesAreAlike(String s) {
        // Write your code here
        int n = s.length();
        String firstHalf = s.substring(0, n / 2);
        String secondHalf = s.substring(n / 2);

        return countVowels(firstHalf) == countVowels(secondHalf);
    }

    private static int countVowels(String str) {
        int count = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
   
}
