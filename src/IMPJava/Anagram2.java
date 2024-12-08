package IMPJava;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {
		String str="listen",str1="silent";
		if(str.length()!=str1.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		char [] arr1=str.toCharArray();
		char [] arr2=str1.toCharArray();
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		
		if(Arrays.equals(arr1, arr2)){
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}
