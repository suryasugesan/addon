package addon;

import java.util.Scanner;

public class menu_double {
	Node head;
	class Node {
	    int data;
	    Node prev, next;

	    Node(int data) {
	        this.data = data;
	    }
	}
	public void insertAtBeginning(int data) {
	        Node newNode = new Node(data);
	        if (head != null) {
	            newNode.next = head;
	            head.prev = newNode;
	        }
	        head = newNode;
	    }
	public void insertAtEnd(int data) {
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
	public void deleteByValue(int value) {
	        if (head == null) return;

	        Node current = head;

	        while (current != null && current.data != value)
	            current = current.next;

	        if (current == null) {
	            System.out.println("Value not found.");
	            return;
	        }

	        if (current == head)
	            head = current.next;

	        if (current.next != null)
	            current.next.prev = current.prev;

	        if (current.prev != null)
	            current.prev.next = current.next;

	        System.out.println("Deleted: " + value);
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
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

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
	        Scanner sc = new Scanner(System.in);
	       menu_double dll = new menu_double();
	        int choice, value;

	        do {
	            System.out.println("\n--- Doubly Linked List Menu ---");
	            System.out.println("1. Insert at beginning");
	            System.out.println("2. Insert at end");
	            System.out.println("3. Delete by value");
	            System.out.println("4. Traverse forward");
	            System.out.println("5. Traverse backward");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert at beginning: ");
	                    value = sc.nextInt();
	                    dll.insertAtBeginning(value);
	                    break;
	                case 2:
	                    System.out.print("Enter value to insert at end: ");
	                    value = sc.nextInt();
	                    dll.insertAtEnd(value);
	                    break;
	                case 3:
	                    System.out.print("Enter value to delete: ");
	                    value = sc.nextInt();
	                    dll.deleteByValue(value);
	                    break;
	                case 4:
	                    dll.traverseForward();
	                    break;
	                case 5:
	                    dll.traverseBackward();
	                    break;
	                case 6:
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please enter 1–6.");
	            }
	        } while (choice != 6);

	        sc.close();
	    }
	}



