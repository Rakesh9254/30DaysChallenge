package IMPQProgram;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplaicateStringSentances {
	public static void main(String[] args) {
		String Str = "Programming";        //**

		Map<Character, Integer> CharCountMap = new HashMap<Character, Integer>();

		for (char ch : Str.toCharArray()) {
			CharCountMap.put(ch, CharCountMap.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : CharCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("The Character " + entry.getKey() + " Occurs" + entry.getValue() + " times.");
			}
		}
	}

}
