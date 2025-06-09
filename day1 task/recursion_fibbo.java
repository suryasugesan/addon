package addon;
import java.util.Scanner;

public class recursion_fibbo{

	
	    static int fibonacci(int n) {
	        if (n == 0) {
	            return 0; 
	        } else if (n == 1) {
	            return 1; 
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2); 
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter number of Fibonacci terms to print: ");
	        int terms = scanner.nextInt();

	        System.out.println("Fibonacci series using recursion:");
	        for (int i = 0; i < terms; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }

	        scanner.close();
	    }
	}



