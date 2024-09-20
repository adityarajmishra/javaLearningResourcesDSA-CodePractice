import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();

        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(inputLine);

        if (matcher.find()) {
            String numbers = matcher.group(1);
            String[] stringValues = numbers.split(",");

            int[] intValues = new int[stringValues.length];

            for (int i = 0; i < stringValues.length; i++) {
                try {
                    intValues[i] = Integer.parseInt(stringValues[i].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid integer input: " + stringValues[i].trim());
                    return;
                }
            }
            int target = sc.nextInt();

            int ans = countFrequency(intValues, target);
            System.out.println(ans);
        }
    }

    public static int countFrequency(int[] arr, int target) {
        // Write your code here
            int count = 0;
            
            // Traverse the array and count occurrences of target
            for (int num : arr) {
                if (num == target) {
                    count++;
                }
            }
            
            return count;
    }
}