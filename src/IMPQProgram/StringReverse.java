package IMPQProgram;

public class StringReverse {
	public static void main(String[] args) {
		String str = "Hello";
		
		char []ch = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
	}

}
