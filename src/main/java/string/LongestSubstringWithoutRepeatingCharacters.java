package string;

import java.util.HashSet;
import java.util.Set;

/**
 * This class provides a method to find the length of the longest substring
 * without repeating characters in a given string.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Finds the length of the longest substring without repeating characters.
     *
     * @param s The input string.
     * @return The length of the longest substring with unique characters.
     */
    public static int lengthOfLongestSubstring(String s) {
        // Convert the input string into a character array for easy manipulation
        char[] chars = s.toCharArray();

        // Variable to keep track of the maximum length of substring found
        int maxSubstring = 0;

        // Set to store unique characters in the current window
        Set<Character> set = new HashSet<>();

        // Start index of the current window
        int startIndex = 0;

        // Iterate over each character in the string
        for (int i = 0; i < chars.length; i++) {
            // If the current character is already in the set, remove characters
            // from the start index until the current character can be added
            while (set.contains(chars[i])) {
                set.remove(chars[startIndex]);
                startIndex++;
            }

            // Add the current character to the set
            set.add(chars[i]);

            // Update the maximum length of the substring found
            maxSubstring = Math.max(maxSubstring, i - startIndex + 1);
        }

        // Return the length of the longest substring without repeating characters
        return maxSubstring;
    }
}
