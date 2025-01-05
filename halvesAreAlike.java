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
        int n = s.length();
        int halfLength = n / 2;
        
        String a = s.substring(0, halfLength);
        String b = s.substring(halfLength);
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        
        int aVowelCount = 0;
        int bVowelCount = 0;
        
        // Count vowels in the first half (a)
        for (char c : a.toCharArray()) {
            if (vowels.contains(Character.toLowerCase(c))) {
                aVowelCount++;
            }
        }
        
        // Count vowels in the second half (b)
        for (char c : b.toCharArray()) {
            if (vowels.contains(Character.toLowerCase(c))) {
                bVowelCount++;
            }
        }
        
        return aVowelCount == bVowelCount;
    }
   
}
