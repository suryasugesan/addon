package addon;
import java.util.Scanner;

public class array {
  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] array = new int[100]; 
	        int size = 0;

	       
	        System.out.print("Enter the number of elements (max 100): ");
	        size = scanner.nextInt();

	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	      
	        System.out.print("Enter element to insert: ");
	        int element = scanner.nextInt();

	        System.out.print("Enter position to insert (0 to " + size + "): ");
	        int position = scanner.nextInt();

	        if (position < 0 || position > size || size >= array.length) {
	            System.out.println("Invalid position or array is full.");
	        } else {
	            
	            for (int i = size; i > position; i--) {
	                array[i] = array[i - 1];
	            }
	            array[position] = element;
	            size++;

	          
	            System.out.println("Array after insertion:");
	            for (int i = 0; i < size; i++) {
	                System.out.print(array[i] + " ");

	            }
	        }
	       
  }
}

	