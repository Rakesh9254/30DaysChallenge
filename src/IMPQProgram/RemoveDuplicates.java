package IMPQProgram;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "Programming";
		StringBuilder sb = new StringBuilder();
		
		//ASCII characters
		
		boolean[] seen = new boolean[256]; 

		for (char ch : str.toCharArray()) {
			if (!seen[ch]) {
				sb.append(ch);
				seen[ch] = true;

			}
		}
		System.out.println("String after removing duplicates: " + sb.toString());
	}
}
