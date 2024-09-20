import java.util.*;

class Solution {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int data) {
        // Add the new element to queue1
        queue1.add(data);
    }

    public int pop() {
        // If queue1 is empty, return -1 (or any indicator of an empty stack)
        if (queue1.isEmpty()) {
            return -1;
        }
        
        // Transfer elements from queue1 to queue2, leaving the last element as the top of the stack
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        
        // The last element in queue1 is the top of the stack
        int topElement = queue1.poll();
        
        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        
        return topElement;
    }

    public int top() {
        // If queue1 is empty, return -1 (or any indicator of an empty stack)
        if (queue1.isEmpty()) {
            return -1;
        }
        
        // Transfer elements from queue1 to queue2, leaving the last element as the top of the stack
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        
        // The last element in queue1 is the top of the stack
        int topElement = queue1.peek();
        
        // Move the top element to queue2
        queue2.add(queue1.poll());
        
        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        
        return topElement;
    }
}

public class Main {
    // Do not modify this code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution stack = new Solution();
        int Q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < Q; i++) {
            String[] query = scanner.nextLine().split(" ");
            int queryType = Integer.parseInt(query[0]);
            if (queryType == 0) {
                int value = Integer.parseInt(query[1]);
                stack.push(value);
            } else if (queryType == 1) {
                System.out.println(stack.top());
            } else if (queryType == 2) {
                System.out.println(stack.pop());
            }
        }
        scanner.close();
    }
}
