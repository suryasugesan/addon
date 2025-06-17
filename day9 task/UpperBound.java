package addon;

public class UpperBound {
	
	    public static int upperBound(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length;

	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] <= target) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }

	        return low;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 5, 7, 9};  
	        int target = 3;

	        int index = upperBound(arr, target);
	        System.out.println("Upper bound index: " + index);
	    }
	}



