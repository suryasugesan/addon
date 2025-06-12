package addon;

public class circular_delete_any {
	class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail;

	  
	    public circular_delete_any() {
	        tail = null;
	    }

	    
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
	    }

	    
	    public void deleteAtPosition(int position) {
	        if (tail == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	       
	        int count = 1;
	        Node current = tail.next;
	        while (current != tail) {
	            current = current.next;
	            count++;
	        }

	        if (position < 1 || position > count) {
	            System.out.println("Invalid position.");
	            return;
	        }

	        
	        if (position == 1) {
	            Node head = tail.next;
	            if (tail == head) {
	           
	                System.out.println("Deleted node at position 1 with value: " + head.data);
	                tail = null;
	            } else {
	                tail.next = head.next;
	                System.out.println("Deleted node at position 1 with value: " + head.data);
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

	        System.out.println("Deleted node at position " + position + " with value: " + toDelete.data);
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
	        circular_delete_any list = new circular_delete_any();
	        list.insertAtTail(10);
	        list.insertAtTail(20);
	        list.insertAtTail(30);
	        list.insertAtTail(40);
	        System.out.println("Original list:");
	        list.display();
	        list.deleteAtPosition(1);  
	        list.display();
	        list.deleteAtPosition(3); 
	        list.display();
	        list.deleteAtPosition(2); 
	        list.display();
	        list.deleteAtPosition(1);  
	        list.display();
	        list.deleteAtPosition(1); 
	    }
	}



