package addon;


	import java.util.Scanner;

	public class menustack {
	    static final int MAX = 100;
	    int top = -1;
	    int[] stack = new int[MAX];

	  
	    void push(int value) {
	        if (top >= MAX - 1) {
	            System.out.println("Stack Overflow");
	        } else {
	            stack[++top] = value;
	            System.out.println("Pushed " + value);
	        }
	    }

	    
	    void pop() {
	        if (top < 0) {
	            System.out.println("Stack Underflow");
	        } else {
	            System.out.println("Popped " + stack[top--]);
	        }
	    }

	 
	    void peek() {
	        if (top < 0) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println("Top element is " + stack[top]);
	        }
	    }

	   
	    void display() {
	        if (top < 0) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println("Stack elements:");
	            for (int i = top; i >= 0; i--) {
	                System.out.println(stack[i]);
	            }
	        }
	    }

	    public static void main(String[] args) {
	      menustack s = new menustack();
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
	                    s.push(value);
	                    break;
	                case 2:
	                    s.pop();
	                    break;
	                case 3:
	                    s.peek();
	                    break;
	                case 4:
	                    s.display();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        } while (choice != 5);

	        sc.close();
	    }
	}



