package string;

import java.util.Arrays;

public class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {

        // Convert both strings to character arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Check if the sorted arrays are equal
        return Arrays.equals(sChars, tChars);
    }
}
