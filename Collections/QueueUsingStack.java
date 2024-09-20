import java.util.*;

class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Add element to the queue
    public void add(int data) {
        stack1.push(data);
    }

    // Remove element from the queue
    public int remove() {
        // Transfer elements from stack1 to stack2 if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // Remove and return the top element from stack2
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        throw new NoSuchElementException("Queue is empty");
    }

    // Peek at the front element of the queue
    public int front() {
        // Transfer elements from stack1 to stack2 if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // Return the top element from stack2 without removing it
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        throw new NoSuchElementException("Queue is empty");
    }
}

public class Main {
    // Do not modify this code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution queue = new Solution();
        int Q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < Q; i++) {
            String[] query = scanner.nextLine().split(" ");
            int queryType = Integer.parseInt(query[0]);
            if (queryType == 0) {
                int value = Integer.parseInt(query[1]);
                queue.add(value);
            } else if (queryType == 1) {
                System.out.println(queue.front());
            } else if (queryType == 2) {
                queue.remove();
            }
        }
        scanner.close();
    }
}
