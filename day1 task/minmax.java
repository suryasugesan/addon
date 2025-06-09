package addon;
import java.util.Scanner;

public class minmax {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: size of the array
	        System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];

	        // Input: array elements
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Initialize min and max with first element
	        int min = array[0];
	        int max = array[0];

	        // Find min and max
	        for (int i = 1; i < size; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        // Output
	        System.out.println("Minimum element: " + min);
	        System.out.println("Maximum element: " + max);

	        scanner.close();
	    }
	}



	