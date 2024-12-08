package IMPJava;

public class PalindromeCheck {
	public static void main(String[] args) {
		String str="Madam".toLowerCase();
		int start=0,end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				System.out.println("Not a Palindrome");
				return;
			}
			start++;
			end--;
		}
		System.out.println("Palindrome");
	}

}
