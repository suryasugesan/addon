package addon;


import java.util.Scanner;

	public class detc {
	   
	    public static int search(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    
	    public static int search(String[] arr, String target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i].equals(target)) {
	                return i; 
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        int[] intArray = {1, 2, 3, 4, 5};
	        String[] stringArray = {"apple", "banana", "cherry"};

	        System.out.print("Enter the type of input (int/string): ");
	        String inputType = scanner.nextLine().toLowerCase();

	        if (inputType.equals("int")) {
	            System.out.print("Enter an integer to search: ");
	            int target = scanner.nextInt();
	            int result = search(intArray, target);
	            if (result != -1) {
	                System.out.println("Element found at index: " + result);
	            } else {
	                System.out.println("Element not found in the array.");
	            }
	        } else if (inputType.equals("string")) {
	            System.out.print("Enter a string to search: ");
	            String target = scanner.nextLine();
	            int result = search(stringArray, target);
	            if (result != -1) {
	                System.out.println("Element found at index: " + result);
	            } else {
	                System.out.println("Element not found in the array.");
	            }
	        } else {
	            System.out.println("Invalid input type. Please enter 'int' or 'string'.");
	        }

	        scanner.close();
	    }
	}



