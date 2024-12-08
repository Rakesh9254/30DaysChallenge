package Pr20Aug;

public class AlphanumericVerifyed {
	public static void main(String[] args) {
		String Str = "abc123!@*&%";

		StringBuffer alphbet = new StringBuffer();
		StringBuffer numeric = new StringBuffer();
		StringBuffer special = new StringBuffer();

		for (char Ch : Str.toCharArray()) {
			if (Character.isAlphabetic(Ch)) {
				alphbet.append(Ch);
			} else if (Character.isDigit(Ch)) {
				numeric.append(Ch);
			} else {
				special.append(Ch);
			}
		}
		System.out.println(alphbet);
		System.out.println(numeric);
		System.out.println(special);

	}

}
