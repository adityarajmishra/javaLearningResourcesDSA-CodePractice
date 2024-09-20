import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        ArrayList<Integer> list2 = removeElement(list);
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i)+" ");
        }
    }

    public static ArrayList<Integer> removeElement(ArrayList<Integer> list) {
        // Remove the fourth element and return the ArrayList.
        list.remove(3);
        return list;
        
    }
}
