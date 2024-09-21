package arrays;

// Class to check if a number is a Harshad number and calculate the sum of its digits
public class HarshadNumberChecker {

    // Method to calculate the sum of the digits of a Harshad number
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int y = x;
        int sum = 0;

        // Calculate the sum of the digits
        while (x > 0) {
            sum += x % 10; // Add the last digit to the sum
            x /= 10; // Remove the last digit
        }

        // Check if the sum of the digits is equal to the original number
        if (sum == y) {
            return sum;
        }
        // Check if the original number is divisible by the sum of its digits
        else if (y % sum == 0) {

            return sum; // Return sum if the number is a Harshad number
        }

        return -1; // Return -1 if not a Harshad number
    }
}
