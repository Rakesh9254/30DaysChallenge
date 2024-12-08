package IdexCel;



public class VowelsAndConsonant {
	public static void main(String[] args) {
		String str = "Automation";
		
		int vowels = 0,Consonant = 0;
		
		for(char C : str.toCharArray()) {
			if(Character.isLetter(C)) {
				if("aeiuoAEIOU".indexOf(C)!=-1) {
					vowels++;
				}else {
					Consonant++;
				}
			}
		}
		System.out.println("Total Vowels :"+vowels);
		System.out.println("Total Consonant :"+Consonant);
	}

}
