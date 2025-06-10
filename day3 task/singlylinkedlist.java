package addon;

public class singlylinkedlist {
	

	   
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node head;
	   
	    public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	   
	    public void insertAtPosition(int data, int position) {
	        Node newNode = new Node(data);

	        if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        for (int i = 0; i < position - 1; i++) {
	            if (temp == null) {
	                System.out.println("Position out of bounds.");
	                return;
	            }
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of bounds.");
	            return;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	   
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	   
	    public static void main(String[] args) {
	        singlylinkedlist list = new singlylinkedlist();

	        list.append(10);
	        list.append(20);
	        list.append(30);

	        System.out.println("Original List:");
	        list.printList();

	        list.insertAtPosition(15, 1); 
	        list.insertAtPosition(5, 0);  
	        list.insertAtPosition(35, 5); 

	        System.out.println("List after insertions:");
	        list.printList();
	    }
	}

	
