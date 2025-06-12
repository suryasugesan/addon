package addon;

public class circular_delete {
	class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail;

	     public circular_delete() {
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
	    public void deleteAtHead() {
	        if (tail == null) {
	            System.out.println("List is empty. Nothing to delete.");
	            return;
	        }

	        Node head = tail.next;

	        if (tail == head) {
	          
	            tail = null;
	        } else {
	            
	            tail.next = head.next;
	        }

	        System.out.println("Deleted head node with value: " + head.data);
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
	        circular_delete list = new circular_delete();
	        list.insertAtTail(10);
	        list.insertAtTail(20);
	        list.insertAtTail(30);
	        System.out.println("Original list:");
	        list.display();  
	        list.deleteAtHead();  
	        System.out.println("After deleting head:");
	        list.display();
	        list.deleteAtHead(); 
	        list.deleteAtHead(); 
	        list.deleteAtHead();  
	}


}
