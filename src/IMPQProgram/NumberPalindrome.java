package IMPQProgram;

public class NumberPalindrome {
	public static void main(String[] args) {
		int number = 121;
		int Orginal_Number = number;
		int reversed =0;
		
		while(number!=0) {
			int digit = number%10;
			reversed = reversed * 10+digit;
			number /=10;
		}
		boolean ispalindrome = Orginal_Number == reversed;
		System.out.println(ispalindrome);
	}

}
