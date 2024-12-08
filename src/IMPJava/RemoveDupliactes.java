package IMPJava;

import java.util.HashSet;

public class RemoveDupliactes {

	public static void main(String[] args) {
		int[] arr = {2,1,2,3,4,5,6,7,8,9};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int num : arr) {
			set.add(num);
		}
		System.out.println(set);

	}

}
