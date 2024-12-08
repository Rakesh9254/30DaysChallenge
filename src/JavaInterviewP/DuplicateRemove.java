package JavaInterviewP;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 ,5,6,7,7,8,8,19};
		
		Set<Integer> set = new HashSet<>();
		
		for(int num : array) {
			set.add(num);
		}
		System.out.println(set);
	}

}
