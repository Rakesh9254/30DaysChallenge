package QA;

public class SwapStrings {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		System.out.println("Before Swapping :");
		System.out.println("str1 :"+ str1);
		System.out.println("str2 :"+ str2);

		// Concatenate
		str1 = str1 + str2; // HelloWorld

		str2 = str1.substring(0, str1.length() - str2.length()); // Hello

		str1 = str1.substring(str2.length()); // world
		
		
		System.out.println("After Swapping :");
		System.out.println("str1 :"+ str1);
		System.out.println("str2 :"+ str2);

	}
}
