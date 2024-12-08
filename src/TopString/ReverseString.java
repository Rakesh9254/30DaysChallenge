package TopString;

public class ReverseString {
	public static void main(String[] args) {
		String str= "Rakesh";
		char[] chArray=str.toCharArray();
		
		for(int i=chArray.length-1;i>=0;i--) {
			System.out.print(chArray[i]);
		}
		System.out.println();
	}

}
