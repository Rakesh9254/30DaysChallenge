package JavaProgram1;

public class PalindromeCheck {
	public static void main(String[] args) {
		String str = "Madamm".toLowerCase();
		int start=0,end=str.length()-1;
		
		while(start < end) {
			if(str.charAt(start)!=str.charAt(end)) {
				System.out.println(str+" Not Palindrome.");
				return;
			}
			start++;
			end--;
		}
		System.out.println(str+" is a Palindrome.");
	}

}
