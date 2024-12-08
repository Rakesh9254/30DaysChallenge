package IMPJava;

public class REVERSESTR {
	public static void main(String[] args) {
		String str = "HelloWorld";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}
