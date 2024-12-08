package IMPJava;

public class VowelsConsonant {

	public static void main(String[] args) {
		String str="Automation";
		int Vowels=0, Consonant=0;
		
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if("aeiouAEIOU".indexOf(ch)!=-1) {
					Vowels++;
				}else {
					Consonant++;
				}
			}
		}
		System.out.println("Vowels: " +Vowels + ", Consonants: " +Consonant);

	}

}
