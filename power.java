import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //Write your code here
        double result = power(num1, num2);
        System.out.println(result);
    }

    public static double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}
