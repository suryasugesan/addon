package addon;

public class selectionsort {
	
	    
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;

	       
	        for (int i = 0; i < n - 1; i++) {
	           
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	         
	            if (minIndex != i) {
	                int temp = arr[i];
	                arr[i] = arr[minIndex];
	                arr[minIndex] = temp;
	            }
	        }
	    }

	   
	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] array = {64, 25, 12, 22, 11};

	        System.out.println("Original array:");
	        printArray(array);

	        selectionSort(array);

	        System.out.println("Sorted array:");
	        printArray(array);
	    }
	}



