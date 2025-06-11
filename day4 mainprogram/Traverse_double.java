package addon;

public class Traverse_double {
	Node head;
	class Node {
	    int data;
	    Node prev;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}
	public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node last = head;
	        while (last.next != null)
	            last = last.next;

	        last.next = newNode;
	        newNode.prev = last;
	    }
	public void traverseForward() {
	        Node current = head;
	        System.out.print("Forward: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	public void traverseBackward() {
	        if (head == null) return;
	        Node current = head;
	        while (current.next != null)
	            current = current.next;
	        System.out.print("Backward: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	      Traverse_double dll = new Traverse_double();
	        dll.append(10);
	        dll.append(20);
	        dll.append(30);
	        dll.append(40);
	        dll.traverseForward();  
	        dll.traverseBackward();
	    }
	}



