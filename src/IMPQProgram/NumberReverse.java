package IMPQProgram;

public class NumberReverse {
	public static void main(String[] args) {
		int number = 12345;
		int Reversed =0;
		
		while(number !=0) {
			int digit = number%10;
			Reversed = Reversed *10 + digit;
			number /=10;
		}
		System.out.println(Reversed);
	}

}
