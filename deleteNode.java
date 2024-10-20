import java.util.*;

class Solution {
    public static Node deleteNode(Node head, int m, int n){
		//write your code here
		//You can refer the node class defination given below
        Node current = head;
        
        while (current != null) {
            // Skip m nodes
            for (int i = 1; i < m && current != null; i++) {
                current = current.next;
            }
            
            // Now delete next n nodes
            if (current == null) {
                break;
            }
            
            Node temp = current.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }
            
            // Link the current node to the node after the deleted nodes
            current.next = temp;
            
            // Move the current pointer to the next position
            current = temp;
        }
        
        return head;
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
Node head = null;
Node tail = null;
int m = sc.nextInt();
int n = sc.nextInt();
while(sc.hasNext()){
	

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
	printLinkedList(Solution.deleteNode(head,m,n));
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
