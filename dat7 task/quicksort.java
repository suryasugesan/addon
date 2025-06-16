package addon;

public class quicksort {
	
	   
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	           
	            int pivotIndex = partition(arr, low, high);

	          
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }

	   
	    private static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1; 

	        for (int j = low; j < high; j++) {
	         
	            if (arr[j] <= pivot) {
	                i++;
	               
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	       
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
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

	        quickSort(array, 0, array.length - 1);

	        System.out.println("Sorted array:");
	        printArray(array);
	    }
	}



