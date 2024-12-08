package Pr20Aug;

public class StringOccurrence {
	public static void main(String[] args) {
		String str = "Hello World";
		
		char target = 'l';
		int count=0;
		System.out.println(str.length());
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == target) {
				count++;
			}
		}
		System.out.println("The character is "+ target +" is " + count +" times Occurrence.");
		
	}

}
