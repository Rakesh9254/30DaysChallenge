package R1Impsheet;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Rakesh";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}
