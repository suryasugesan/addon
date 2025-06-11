package addon;

public class delete_double {
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
	public  void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node last = head;
	        while (last.next != null) last = last.next;
	        last.next = newNode;
	        newNode.prev = last;
	    }
	public void deleteMiddleNode() {
	        if (head == null) return;

	        Node slow = head;
	        Node fast = head;
	        
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        Node mid = slow;
	        if (mid == head) {
	            head = mid.next;
	            if (head != null) head.prev = null;
	        } else {
	           
	            if (mid.prev != null) mid.prev.next = mid.next;
	            if (mid.next != null) mid.next.prev = mid.prev;
	        }

	        
	        mid.next = null;
	        mid.prev = null;
	    }

	   
	    void printList() {
	        Node curr = head;
	        while (curr != null) {
	            System.out.print(curr.data + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        delete_double dll = new delete_double();

	        dll.append(1);
	        dll.append(2);
	        dll.append(3);
	        dll.append(4);
	        dll.append(5);
	        System.out.print("Original list: ");
	        dll.printList();
	        dll.deleteMiddleNode();
	        System.out.print("After deleting middle node: ");
	        dll.printList();
	    }
	}



