package addon;

public class mergesort {
	
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	           
	            int mid = left + (right - left) / 2;

	           
	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	           
	            merge(arr, left, mid, right);
	        }
	    }
	    private static void merge(int[] arr, int left, int mid, int right) {
	        
	        int n1 = mid - left + 1;
	        int n2 = right - mid;
	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];
	        for (int i = 0; i < n1; i++) {
	            leftArray[i] = arr[left + i];
	        }
	        for (int j = 0; j < n2; j++) {
	            rightArray[j] = arr[mid + 1 + j];
	        }
	        int i = 0, j = 0;
	        int k = left; 
	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }
	        while (j < n2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }
	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] array = {38, 27, 43, 3, 9, 82, 10};

	        System.out.println("Original array:");
	        printArray(array);

	        mergeSort(array, 0, array.length - 1);

	        System.out.println("Sorted array:");
	        printArray(array);
	    }
	}


	

	    
	   