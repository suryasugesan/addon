package addon;

public class rank {
	
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

	    public static int findRank(int[] arr, int target) {
	        return lowerBound(arr, target);
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 5, 7, 9}; 
	        int target = 5;

	        int rank = findRank(arr, target);
	        System.out.println("Rank of " + target + ": " + rank);
	    }
	}



