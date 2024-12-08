package JavaProgram1;

import java.util.HashMap;
import java.util.Map;

public class KeysValue {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Rakesh");
		map.put(2, "Roshan");
		map.put(3, "Patna");
		map.put(4, "Bangalore");
		map.put(5, "Ranchi");
		
		
		for(int num : map.keySet()) {
			System.out.println("Key:"+ num +", Values:"+map.get(num));
		}
	}

}
