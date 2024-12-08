package IdexCel;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String str = "silent";
		String str1 = "listen";

		if (str.length() != str1.length()) {
			System.out.println("Not a anagram");
		}
		char[] array = str.toCharArray();
		char[] array1 = str1.toCharArray();

		Arrays.sort(array);
		Arrays.sort(array1);

		if (Arrays.equals(array, array1)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}

	}

}
