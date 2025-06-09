package addon;

public class target {
	    public static void main(String[] args) {
	        int[] arr = {4, 5, 2, 6, 9, 10};
	        int target = 8;
	        boolean found = false;
	        for (int i = 0; i < arr.length - 1; i++) 
	        {
	            for (int j = i + 1; j < arr.length; j++) 
	            {
	                if (arr[i] + arr[j] == target) 
	                {
	                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
	                    found = true;
	                }
	            }
	        }

	        if (!found) 
	        {
	            System.out.println("No pair found with sum " + target);
	        }
	    }
	}



