import java.util.*;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s = reverse(input);
        System.out.println(s);
    }

    public static String reverse(String s) {
        // write your code here
        return new StringBuilder(s).reverse().toString();
    }
}
