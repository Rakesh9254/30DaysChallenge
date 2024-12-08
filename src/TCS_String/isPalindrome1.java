package TCS_String;

public class isPalindrome1 {
	public static boolean isPalindrome(String str) {
		int left=0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)!= str.charAt(right)) {
				System.out.println("Not A Palindrome.");
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		String str= "Madam";
		str=str.toLowerCase();
		System.out.println(str+" is a Palindrome : "+isPalindrome(str));
		
	}

}
