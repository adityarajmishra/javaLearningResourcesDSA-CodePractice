import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int result = accessElement(list);
        System.out.println(result);  // This is just to see the output.
    }

    public static int accessElement(ArrayList<Integer> list) {
        // Access and return the third element
        return list.get(2);
        
    }
}
