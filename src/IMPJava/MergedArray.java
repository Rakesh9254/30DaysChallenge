package IMPJava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergedArray {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {6,4,5};
		
		int[] c =new int [a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length] = b[i];
		}
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int num : c) {
			set.add(num);
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}

}
