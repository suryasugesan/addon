package addon;

public class Linkedlist {
	static class Node 
	{
	        int data;
	        Node next;

	        Node(int data) 
	        {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node head;
	    public void append(int data) 
	    {
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
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        if (position == 0) {
	            head = head.next;
	            return;
	        }

	        Node temp = head;
	        for (int i = 0; i < position - 1; i++) {
	            if (temp == null || temp.next == null) {
	                System.out.println("Position out of bounds.");
	                return;
	            }
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Position out of bounds.");
	            return;
	        }

	        temp.next = temp.next.next;
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
	        Linkedlist list = new Linkedlist();
	        list.append(10);
	        list.append(20);
	        list.append(30);
	        list.append(40);

	        System.out.println("Original List:");
	        list.printList();

	        list.deleteAtPosition(2);

	        System.out.println("After deleting node at position 2:");
	        list.printList();
	    }
	}



