package IMPJava;

public class Palindrome2 {
	public static void main(String[] args) {
		String str = "Madam";
		str= str.toLowerCase();
		
		int start =0,end= str.length()-1;
		
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				System.out.println("Not a Palindrome");
			}
			start++;
			end--;
		}
		System.out.println("Palindrome");
				
	}

}
