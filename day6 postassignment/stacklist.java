package addon;


	
	import java.util.Scanner;

	import java.util.Scanner;

	public class stacklist {
	    // Inner Node class (non-static)
	    class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node top = null;

	    public void push(int value) {
	        Node newNode = new Node(value);
	        newNode.next = top;
	        top = newNode;
	        System.out.println("Pushed: " + value);
	    }

	    public void pop() {
	        if (top == null) {
	            System.out.println("Stack Underflow");
	        } else {
	            System.out.println("Popped: " + top.data);
	            top = top.next;
	        }
	    }

	    public void peek() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println("Top element: " + top.data);
	        }
	    }

	    public void display() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println("Stack elements:");
	            Node temp = top;
	            while (temp != null) {
	                System.out.println(temp.data);
	                temp = temp.next;
	            }
	        }
	    }

	    public static void main(String[] args) {
	       stacklist stack = new stacklist();
	        Scanner sc = new Scanner(System.in);
	        int choice, value;

	        do {
	            System.out.println("\n=== Stack Menu ===");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to push: ");
	                    value = sc.nextInt();
	                    stack.push(value);
	                    break;
	                case 2:
	                    stack.pop();
	                    break;
	                case 3:
	                    stack.peek();
	                    break;
	                case 4:
	                    stack.display();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while (choice != 5);

	        sc.close();
	    }
	}
	