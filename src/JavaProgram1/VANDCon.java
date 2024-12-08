package JavaProgram1;

public class VANDCon {
	public static void main(String[] args) {
		String str = "Automation";
		int count=0,Vowels=0;
		
		for(char C : str.toCharArray()) {
			if(Character.isLetter(C)) {
				if("aeiouAEIOU".indexOf(C)!=-1) {
					count++;
				}else {
					Vowels++;
				}
			}
		}
		System.out.println(count);
		System.out.println(Vowels);
	}

}
