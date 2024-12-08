package IMPJava;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,3,4,5,6};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int num : array) {
			set.add(num);
		}
		System.out.println(set);

	}

}
