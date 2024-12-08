package TopString;

public class SwapString {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "World";
		System.out.println("Befor Swapping : ");
		System.out.println(str);
		System.out.println(str1);
		
		
		System.out.println("After Swaping : ");
		str1 = str+str1; //HelloWorld
		str = str1.substring(str1.length()-str.length());
		str1=str1.substring(0,str1.length()-str.length());
		System.out.println(str);  //World
		System.out.println(str1); //Hello
	}

}
