import java.util.*;

class Solution {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int data) {
        // Add the new element to queue1
        queue1.add(data);
    }

    public String pop() {
        // Check if queue1 is empty
        if (queue1.isEmpty()) {
            return "Queue is empty"; // or any message to indicate the stack is empty
        }

        // Transfer all elements except the last from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // The last element in queue1 is the one to be popped
        int poppedElement = queue1.poll();

        // Swap queue1 and queue2 to maintain stack order
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return String.valueOf(poppedElement);
    }
}

public class Main {
    // Do not modify this code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution list = new Solution();
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String command = scanner.nextLine();
            if (command.startsWith("Push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                list.push(value);
            } else if (command.equals("Pop")) {
                System.out.println(list.pop());
            }
        }
        scanner.close();
    }
}
