package IMPQProgram;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "racecar";
		
		String reveresed = new StringBuilder(str).reverse().toString();
		boolean ispalindrone = str.equals(reveresed);
		
		System.out.println(ispalindrone);
	}

}
