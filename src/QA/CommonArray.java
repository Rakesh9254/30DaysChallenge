package QA;

import java.util.HashSet;
import java.util.Set;

public class CommonArray {
	public static void main(String[] args) {
		int [] array  = {1,2,3,4,5};
		int [] array1 = {2,3,5,7,8};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int num : array) {
			set.add(num);
		}
		System.out.println("Common elements: ");
		
		for(int num : array1) {
			if(set.contains(num)) {
				System.out.println(num + " ");
			}
		}
	}

}
