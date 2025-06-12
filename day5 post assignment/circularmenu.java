package addon;
import java.util.Scanner;

public class circularmenu {
	 class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail = null;  

	   
	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);

	        if (tail == null) {
	            tail = newNode;
	            tail.next = tail;
	        } else {
	            newNode.next = tail.next;
	            tail.next = newNode;
	            tail = newNode;
	        }
	        System.out.println("Inserted: " + data);
	    }
 
	    public void deleteAtPosition(int position) {
	        if (tail == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        int count = 1;
	        Node temp = tail.next;
	        while (temp != tail) {
	            temp = temp.next;
	            count++;
	        }

	        if (position < 1 || position > count) {
	            System.out.println("Invalid position.");
	            return;
	        }

	        
	        if (position == 1) {
	            Node head = tail.next;
	            if (tail == head) {
	                System.out.println("Deleted: " + head.data);
	                tail = null;
	            } else {
	                tail.next = head.next;
	                System.out.println("Deleted: " + head.data);
	            }
	            return;
	        }

	       
	        Node prev = tail.next;
	        for (int i = 1; i < position - 1; i++) {
	            prev = prev.next;
	        }
	        Node toDelete = prev.next;
	        prev.next = toDelete.next;

	        if (toDelete == tail) {
	            tail = prev;
	        }

	        System.out.println("Deleted: " + toDelete.data);
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
	        Scanner sc = new Scanner(System.in);
	        circularmenu list = new circularmenu();

	        int choice;
	        do {
	            System.out.println("\n--- Circular Linked List Menu ---");
	            System.out.println("1. Insert at Tail");
	            System.out.println("2. Delete at Position");
	            System.out.println("3. Display List");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    int val = sc.nextInt();
	                    list.insertAtTail(val);
	                    break;
	                case 2:
	                    System.out.print("Enter position to delete (1-based): ");
	                    int pos = sc.nextInt();
	                    list.deleteAtPosition(pos);
	                    break;
	                case 3:
	                    list.display();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}


