package addon;

public class insertionsort {
	
	   
	    public static void insertionSort(int[] arr) {
	        int n = arr.length;

	       
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int j = i - 1;

	           
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key; 
	        }
	    }

	   
	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] array = {64, 34, 25, 12, 22, 11, 90};

	        System.out.println("Original array:");
	        printArray(array);

	        insertionSort(array);

	        System.out.println("Sorted array:");
	        printArray(array);
	    }
	}



