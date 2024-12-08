package IMPJava;

import java.util.HashMap;
import java.util.Map;

public class DupliacteElemet {
	public static void main(String[] args) {
		String str = "Java Program";
		
		Map<Character, Integer> dupchar = new HashMap<>();
		
		char [] charArray = str.toCharArray();
		
		for(char keys : charArray) {
			if(Character.isAlphabetic(keys)) {
				if(dupchar.containsKey(keys)) {
					dupchar.put(keys, dupchar.get(keys)+1);
				}else {
					dupchar.put(keys,1);
				}
			}
		}
		//dupchar.entrySet().removeIf(i->i.getValue()==1);
		System.out.println(dupchar);
	}

}
