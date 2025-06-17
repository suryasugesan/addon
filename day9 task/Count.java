package addon;

public class Count {
	
	    public static int lowerBound(int[] arr, int target) {
	        int low = 0, high = arr.length;
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }
	        return low;
	    }

	    public static int upperBound(int[] arr, int target) {
	        int low = 0, high = arr.length;
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

	    public static int countOccurrences(int[] arr, int target) {
	        return upperBound(arr, target) - lowerBound(arr, target);
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 3, 5, 7, 9}; 
	        int target = 3;

	        int count = countOccurrences(arr, target);
	        System.out.println("Count of " + target + ": " + count);
	    }
	}



