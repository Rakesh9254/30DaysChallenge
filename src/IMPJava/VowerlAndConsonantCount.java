package IMPJava;

public class VowerlAndConsonantCount {
	public static void main(String[] args) {
		String string= "Automation";
		int voe=0,con=0;
		for(char ch :string.toCharArray()) {
			if(Character.isLetter(ch)) {
				if("aeiuoAEIOU".indexOf(ch)!=-1) {
					voe++;
				}else {
					con++;
				}
			}
		}
		System.out.println(voe+" "+con);
	}

}
