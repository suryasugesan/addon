package addon;

public class DoublyLinkedList {
	 class Node {
	        int data;
	        Node prev;
	        Node next;

	        Node(int data) {
	            this.data = data;
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
	        newNode.prev = temp;
	    }
	    public void insertMiddle(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node slow = head;
	        Node fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        newNode.prev = slow.prev;
	        newNode.next = slow;

	        if (slow.prev != null) {
	            slow.prev.next = newNode;
	        } else {
	            
	            head = newNode;
	        }

	        slow.prev = newNode;
	    }
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        DoublyLinkedList dll = new DoublyLinkedList();
	        dll.append(1);
	        dll.append(2);
	        dll.append(4);
	        dll.append(5);
	        System.out.println("Original List:");
	        dll.printList();
	        dll.insertMiddle(3);
	        System.out.println("After inserting 3 in the middle:");
	        dll.printList();
	    }
	}


