package TCS_String;

public class countWords {
public static int countWords(String str) {
		int count = 0;
		boolean wordstart = false;
		for (int i = 0; i <= str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i))) {
				wordstart = false;

			} else if (!wordstart) {
				count++;
				wordstart = true;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String str= "Madam";
		System.out.println(countWords(str));

	}

}
