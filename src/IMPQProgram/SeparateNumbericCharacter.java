package IMPQProgram;

public class SeparateNumbericCharacter {

	public static void main(String[] args) {
		String str = "abc123!@#";

		StringBuilder alphabets = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder symbols = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				alphabets.append(ch);
			} else if (Character.isDigit(ch)) {
				numbers.append(ch);
			} else {
				symbols.append(ch);
			}
		}

		// Output the results
		System.out.println("Alphabets: " + alphabets.toString());
		System.out.println("Numbers: " + numbers.toString());
		System.out.println("Symbols: " + symbols.toString());
	}
}
