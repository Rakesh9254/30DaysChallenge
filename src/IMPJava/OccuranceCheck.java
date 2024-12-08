package IMPJava;

public class OccuranceCheck {
	public static void main(String[] args) {
		String str="Automation";
		str = str.toLowerCase();
		char c='a';
		int count=0;
		for(char ch : str.toCharArray()) {
			if(c==ch) {
				count++;
			}
		}
		System.out.println(count);
	}

}
