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
            int[] array = incrementArray(intValues);
            System.out.println(Arrays.toString(array));


        } else {
            System.out.println("Invalid input format. Please use [1, 2, 3, 4, 5] format.");
        }


    }

    public static int[] incrementArray(int[] digits) {
        //Write your code here
    int n = digits.length;

    // Start from the end of the array
    for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            // No carry needed, just increment the current digit and return
            digits[i]++;
            return digits;
        }
        // Set the current digit to 0 and move the carry to the next digit
        digits[i] = 0;
    }

    // If we exit the loop, it means we have all 9s and need an extra digit at the beginning
    int[] newNumber = new int[n + 1];
    newNumber[0] = 1;
    return newNumber;
}
}