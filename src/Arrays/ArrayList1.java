package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		String[] str = {"Red","Green","Organe"};
		//Apparch 
		/*
		List list = Arrays.asList(str);
		System.out.println(list);
		*/
		// 2nd Approch
		/*
		List<String> list = new ArrayList<>();
		Collections.addAll(list, str);
		System.out.println(list);
		*/
		
		//3rd Approach
		List<String> list = new ArrayList<String>();
		
		for(String str1:str) {
			list.add(str1);
		}
		System.out.println(list);
		
	}

}
