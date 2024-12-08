package QAFoxYT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any Character : ");
		String str = scanner.nextLine().toLowerCase().replaceAll("\\s", "");
		scanner.close();

		Map<Character, Integer> map = new HashMap<>();
		char[] chaa = str.toCharArray();

		for (char ch : chaa) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);

	}

}
