package addon;
import java.util.Scanner;

public class circularlinkedlist {
	
	   class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail;

	    public circularlinkedlist() {
	        tail = null;
	    }
	    public void insert(int data) {
	        Node newNode = new Node(data);

	        if (tail == null) {
	            tail = newNode;
	            tail.next = tail;
	        } else {
	            
	            newNode.next = tail.next;
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    public void display() {
	        if (tail == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node current = tail.next;
	        do {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        } while (current != tail.next);

	        System.out.println("(back to head)");
	    }

	     public static void main(String[] args) {
	        circularlinkedlist cll = new circularlinkedlist();
	        cll.insert(10);
	        cll.insert(20);
	        cll.insert(30);
	        cll.insert(40);
	        cll.display(); 
	    }
	}



 