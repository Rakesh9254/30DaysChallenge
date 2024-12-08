package IMPJava;

import java.util.Arrays;

public class Anagram23 {
	public static void main(String[] args) {
		String str1 = "Listen", str2 = "Silent";
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram.");
			return;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr1);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram.");
		}

	}

}
