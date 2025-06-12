package addon;

public class circular_insert {
	 class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node tail; 
	    public circular_insert() {
	        tail = null;
	    }
	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);

	        if (tail == null) 
	        {
	            
	            tail = newNode;
	            tail.next = newNode;
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
	        circular_insert list = new circular_insert();
	        list.insertAtTail(100);
	        list.insertAtTail(200);
	        list.insertAtTail(300);
	        list.display(); 
	    }
	}

	

	   
