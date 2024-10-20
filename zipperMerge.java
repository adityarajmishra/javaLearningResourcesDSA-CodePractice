import java.util.*;

class Solution{

    public static void zipperMerge(Node head){
		//write your code here
        if (head == null || head.next == null) return;

        // Step 1: Find the middle of the list
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        Node secondHalf = slow.next;
        slow.next = null;  // Break the list into two halves
        secondHalf = reverseList(secondHalf);

        // Step 3: Merge two halves in a zipper fashion
        Node firstHalf = head;
        while (secondHalf != null) {
            Node temp1 = firstHalf.next;
            Node temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    // Function to reverse a linked list
    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}

class Node{
	int data;
	Node next;

public Node(int data){
    this.next = null;
    this.data = data;
  }

  public Node(int data, Node next){
    this.next = next;
    this.data = data;
  }

  public Node(){
    this.data = 0;
    this.next = null;
  }

}

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        for(int i=0; i<n; i++){
            int data = sc.nextInt();
            if(data == -1)break;
            
            Node newNode = new Node(data);
            
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next= newNode;
                tail = tail.next;
            }
        }

    Solution.zipperMerge(head);
    printLinkedList(head);

    }
private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
	
}
