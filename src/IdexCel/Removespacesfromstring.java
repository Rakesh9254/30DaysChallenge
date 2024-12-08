package IdexCel;

public class Removespacesfromstring {
	public static void main(String[] args) {
		String str = "Hello World Java";
		
		String results = str.replaceAll("\\s+", "");
		System.out.println(results);
	}

}
