import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        iterateElements(list);
    }

    public static void iterateElements(ArrayList<Integer> list) {
        // Iterate and print all elements in the ArrayList.
        for (int x=0; x<list.size(); x++)
            System.out.print(list.get(x)+ " ");
        
    }
}
