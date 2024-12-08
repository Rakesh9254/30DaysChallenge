package IMPJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeated {
    public static void main(String[] args) {
        String str = "swiss";
        
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        
        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Find the first non-repeated character
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                return; // Exit after finding the first non-repeated character
            }
        }
        
        // If no non-repeated character is found
        System.out.println("No non-repeated character found.");
    }
}
