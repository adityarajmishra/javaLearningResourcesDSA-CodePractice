import java.util.*;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String ans = findRepeated(n);
        System.out.println(ans);
    }


    private static String findRepeated(String s) {
       //Write your code here
        Set<Character> seen = new HashSet<>();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the character has already been seen, return it as the result
            if (seen.contains(c)) {
                return Character.toString(c);
            }
            // Otherwise, add the character to the set
            seen.add(c);
        }
        
        // If no character is repeated, return an empty string or a special message
        return "";
    }

}