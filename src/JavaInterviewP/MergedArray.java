package JavaInterviewP;

import java.util.Arrays;

public class MergedArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] array1 = { 6, 7, 8, 9, 10 };

		int[] merged = new int[array1.length + array.length];
		for (int i = 0; i < array.length; i++) {
			merged[i] = array[i];
		}
		
		for (int i = 0; i < array1.length; i++) {
			merged[i+array1.length] = array1[i];
		}

		System.out.println(Arrays.toString(merged));

	}
}