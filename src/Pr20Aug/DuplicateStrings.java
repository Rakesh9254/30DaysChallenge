package Pr20Aug;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class DuplicateStrings {
    public static void main(String[] args) {
        String str = "Programming";

        // Create a Set to keep track of seen characters
        Set<Character> seen = new HashSet<>();
        // Create a List to store duplicates
        List<Character> duplicates = new ArrayList<>();

        // Convert the string to a character array
//        char[] chars = str.toCharArray();

        // Iterate over each character
        for (char ch : str.toCharArray()) {
            // If the character has been seen before, add it to duplicates
            if (seen.contains(ch) && !duplicates.contains(ch)) {
                duplicates.add(ch);
            } else {
                // Otherwise, mark the character as seen
                seen.add(ch);
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters:");
        for (char ch : duplicates) {
            System.out.println(ch);
        }
    }
}
