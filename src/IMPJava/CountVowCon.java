package IMPJava;

public class CountVowCon {
	public static void main(String[] args) {
		String str = "Automation";
		int vow=0,cont=0;
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				if("aeiouAEIOU".indexOf(c)!=-1) {
					vow++;
				}else {
					cont++;
				}
			}
		}
		System.out.println("Vowels: "+vow + " cont : "+cont);
	}

}
