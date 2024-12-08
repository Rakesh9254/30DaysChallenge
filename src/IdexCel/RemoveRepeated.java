package IdexCel;

import java.util.ArrayList;

public class RemoveRepeated {
    public static void main(String[] args) {
        String input = "This is a test This is a demo test demo";
        String results = removeDuplicates(input);
        System.out.println("String after removing repeated words: " + results);
    }

    public static String removeDuplicates(String input) {
        // Split the input string by spaces to get individual words
        String[] words = input.split("\\s+");

        // Create an ArrayList to store unique words
        ArrayList<String> uniqueWords = new ArrayList<String>();

        // Loop through the array of words
        for (String word : words) {
            // Add the word to the list if it's not already present
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }

        // Join the unique words back into a string and return it
        return String.join(" ", uniqueWords);
    }
}
