package string;

public class PalindromeChecker {

    /**
     * Checks if the given string is a palindrome.
     *
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {

        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = input
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        // Reverse the cleaned string
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        // Check if the cleaned string is equal to its reversed version
        return cleanedInput.equals(reversedInput);
    }
}
