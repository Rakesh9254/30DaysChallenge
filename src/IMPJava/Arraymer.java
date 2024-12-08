package IMPJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Arraymer {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 4, 5, 6, 7 };
        System.out.println(array1.length);

        int[] results = new int[array1.length + array2.length];

        for (int i = 0; i < 4; i++) {
            results[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            results[i + array1.length] = array2[i];
            
        }

        // Print the merged array
        System.out.println(Arrays.toString(results));
        
        Set<Integer> set = new HashSet<Integer>();
        for(int num : results) {
        	set.add(num);
        }
        System.out.println(set);
    }
}