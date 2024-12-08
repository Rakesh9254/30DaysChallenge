package IdexCel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveRepeated1 {
	public static void main(String[] args) {
		String str ="hello world hello";
	
		Set<String> uniqueWords = new HashSet<String>(Arrays.asList(str.split("")));
		
		System.out.println(String.join("", uniqueWords));
	}

}
