package addon;

public class palindrome {
	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            char chLeft = str.charAt(left);
	            char chRight = str.charAt(right);
	            if (chLeft >= 'A' && chLeft <= 'Z') {
	                chLeft = (char)(chLeft + 32);
	            }
	            if (chRight >= 'A' && chRight <= 'Z') {
	                chRight = (char)(chRight + 32);
	            }

	            if (chLeft != chRight) {
	                return false;
	            }

	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String input = "computer";

	        if (isPalindrome(input)) {
	            System.out.println("\"" + input + "\"it is a palindrome.");
	        } else {
	            System.out.println("\"" + input + "\" is not a palindrome.");
	        }
	    }
	}



