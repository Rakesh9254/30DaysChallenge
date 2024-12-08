package ArrayAndStringManipulations;

import java.util.*;

public class ArrayAndStringManipulations1 {
    
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 5, 2, 3, 9, 1};
        String str = "  Hello World  ";
        
        System.out.println("Frequency of each element: " + frequency(array));
        System.out.println("Duplicate elements: " + findDuplicates(array));
        System.out.println("Elements in reverse order: " + Arrays.toString(reverseArray(array)));
        System.out.println("Largest element: " + findLargest(array));
        System.out.println("Smallest element: " + findSmallest(array));
        System.out.println("Sum of all items: " + sumArray(array));
        System.out.println("Sorted array: " + Arrays.toString(sortArray(array)));
        System.out.println("Second Largest: " + secondLargest(array));
        System.out.println("Second Smallest: " + secondSmallest(array));
        System.out.println("Odd and Even Numbers: " + Arrays.toString(oddAndEven(array)));
        System.out.println("String without spaces: '" + removeSpaces(str) + "'");
        proveStringImmutability();
        System.out.println("Number of words: " + countWords(str));
        System.out.println("Is palindrome: " + isPalindrome("A man a plan a canal Panama"));
        System.out.println("Reversed string: " + reverseString("Hello"));
        System.out.println("Leading zeros removed: " + removeLeadingZeros("000123"));
        System.out.println("First letter of each word: " + firstLetterOfEachWord(str));
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring("abcabcbb"));
    }

    // 1. Frequency of each element in the array
    static Map<Integer, Integer> frequency(int[] array) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return freqMap;
    }

    // 2. Print the duplicate elements of an array
    static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    // 3. Print the elements of an array in reverse order
    static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // 4. Print the largest element in an array
    static int findLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        for (int num : array) {
            largest = Math.max(largest, num);
        }
        return largest;
    }

    // 5. Print the smallest element in an array
    static int findSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        for (int num : array) {
            smallest = Math.min(smallest, num);
        }
        return smallest;
    }

    // 6. Print the sum of all the items of the array
    static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 7. Sort the elements of an array in ascending order
    static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    // 8. Find Second Largest Number in an Array
    static int secondLargest(int[] array) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        return second;
    }

    // 9. Find Second Smallest Number in an Array
    static int secondSmallest(int[] array) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num > first) {
                second = num;
            }
        }
        return second;
    }

    // 10. Print Odd and Even Numbers from an Array
    static int[][] oddAndEven(int[] array) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        return new int[][] {odd.stream().mapToInt(i -> i).toArray(), even.stream().mapToInt(i -> i).toArray()};
    }

    // 11. Remove all the white spaces in a string
    static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    // 12. Prove that String objects are immutable
    static void proveStringImmutability() {
        String str = "Hello";
        str.concat(" World");
        System.out.println("Original string: " + str); // Still prints "Hello"
    }

    // 13. Program to count the number of words in a string
    static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // 14. Program to check whether a string is a Palindrome
    static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // 15. Reverse a string
    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 16. Remove Leading zeros
    static String removeLeadingZeros(String str) {
        return str.replaceFirst("^0+(?!$)", "");
    }

    // 17. Print first letter of each word in a string
    static String firstLetterOfEachWord(String str) {
        StringBuilder firstLetters = new StringBuilder();
        String[] words = str.trim().split("\\s+");
        for (String word : words) {
            firstLetters.append(word.charAt(0));
        }
        return firstLetters.toString();
    }

    // 18. Find the length of the longest substring without repeating characters
    static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0, start = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (charIndexMap.containsKey(s.charAt(i))) {
                start = Math.max(charIndexMap.get(s.charAt(i)) + 1, start);
            }
            charIndexMap.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        
        return maxLength;
    }
}
