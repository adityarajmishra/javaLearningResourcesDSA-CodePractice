import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    System.out.println(distinctCharacter(str));
	
    }
    public static String distinctCharacter(String str){
		//write your code here
        int n = str.length();
        int[] lastOccurrence = new int[26];  // To store last occurrence of each character
        
        // Fill lastOccurrence array
        for (int i = 0; i < n; i++) {
            lastOccurrence[str.charAt(i) - 'a'] = i;
        }
        
        boolean[] visited = new boolean[26];  // To check if character is already in the stack
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            
            // If the character is already in the stack, continue
            if (visited[c - 'a']) continue;
            
            // Maintain lexicographical order by removing larger characters
            // if they occur later in the string
            while (!stack.isEmpty() && stack.peek() > c && lastOccurrence[stack.peek() - 'a'] > i) {
                visited[stack.pop() - 'a'] = false;  // Mark the character as not visited
            }
            
            stack.push(c);  // Add the current character to the stack
            visited[c - 'a'] = true;  // Mark it as visited
        }
        
        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        return result.toString();
    }
}
