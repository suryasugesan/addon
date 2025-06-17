package addon;

public class leetcode {
	    public static int findLeft(int[] nums, int target) {
	        int left = 0, right = nums.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }
	    public static int findRight(int[] nums, int target) {
	        int left = 0, right = nums.length;
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            if (nums[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left - 1;
	    }
	    public static int[] searchRange(int[] nums, int target) {
	        int left = findLeft(nums, target);
	        int right = findRight(nums, target);
	        if (left > right || left == nums.length || nums[left] != target) {
	            return new int[]{-1, -1};
	        }

	        return new int[]{left, right};
	    }

	    public static void main(String[] args) {
	        int[] nums = {5, 7, 7, 8, 8, 10};  
	        int target = 8;

	        int[] result = searchRange(nums, target);
	        System.out.println("First and last positions of " + target + ": [" + result[0] + ", " + result[1] + "]");
	    }
	}

