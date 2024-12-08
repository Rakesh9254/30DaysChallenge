package QA;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		String str = "aabbccddeeff";
		Set<Character> set = new LinkedHashSet<Character>();
		
		
		for(char ch : str.toCharArray()) {
			set.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for(Character ch : set) {
			sb.append(ch);
		}
		System.out.println("after"+str);
		System.out.println("before :"+sb.toString());
	}

}
