package QA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DupArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 4, 5, 6 };

		Set<Integer> uniquearray = new HashSet<Integer>();
		for (int num : array) {
			uniquearray.add(num);

		}
		System.out.println(uniquearray);

	}

}
