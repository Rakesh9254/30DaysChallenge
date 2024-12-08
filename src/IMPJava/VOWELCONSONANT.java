package IMPJava;

public class VOWELCONSONANT {

	public static void main(String[] args) {
		String str = "Automation Rakesh";
		int Vowels = 0, consonants = 0;

		for (char c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				if ("aeiouAEIOU".indexOf(c) != -1) {
					Vowels++;
				} else {
					consonants++;
				}
			}

		}
		System.out.println("Vowels: " + Vowels + ", Consonts: " + consonants);

	}

}
