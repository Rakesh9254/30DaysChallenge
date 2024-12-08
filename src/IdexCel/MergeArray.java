package IdexCel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class MergeArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] array1 = { 5, 6, 4, 9, 2 };

		int [] merged = new int[array.length+array1.length];
		
		
		for(int i=0;i<array.length;i++) {
			merged[i]= array[i];
		}
		
		for(int i=0;i<array1.length;i++) {
			merged[i+array.length] = array1[i];
		}
		
		
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int num : merged) {
			set.add(num);
		}
		System.out.println(set);
		System.out.println(Arrays.toString(merged));

	}

}
