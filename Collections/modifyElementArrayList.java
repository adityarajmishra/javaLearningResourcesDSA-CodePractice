import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        ArrayList<Integer> list2 = modifyElement(list);
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i)+" ");
        }
    }

    public static ArrayList<Integer> modifyElement(ArrayList<Integer> list) {
        // Modify the second element to 10 and return the ArrayList.
        list.set(1, 10);
        return list;
        
    }
}
