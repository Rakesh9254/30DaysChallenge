package QA;

public class SwapString {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";

		str1 = str1 + str2;
		// HelloWorld
		str2 = str1.substring(0, str1.length() - str2.length());
		// Hello
		str1 = str2.substring(str2.length());

		System.out.println(str2);
		System.out.println(str1);

	}

}
