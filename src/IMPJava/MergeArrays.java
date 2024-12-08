package IMPJava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeArrays {
	public static void main(String[] args) {
		int [] arr1 = {1,3,5};
		int [] arr2 = {3,3,3,4,5};
		
		int[] merged = new int[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, merged, 0, arr1.length);
		System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
		
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int num : merged) {
			set.add(num);
			
		}
		
//		int[] uniqueMerged=new int[set.size()];
//		int index =0;
//		for(int num : set) {
//			uniqueMerged[index++]= num;
//		}
		
		System.out.println(set);
		
		
	}

}
