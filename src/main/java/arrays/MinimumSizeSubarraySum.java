package arrays;

public class MinimumSizeSubarraySum {

    /**
     * Finds the minimum length of a contiguous subarray with a sum greater than or equal to the target.
     *
     * @param target The target sum that the subarray needs to meet or exceed.
     * @param nums The input array of integers.
     * @return The length of the shortest subarray whose sum is greater than or equal to the target.
     *         If no such subarray exists, returns 0.
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int right = 0;
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the sum (expanding the window)
            sum += nums[right];
            right++;

            // Check if the current window's sum is greater than or equal to the target
            while (sum >= target) {
                // Update the minimum window length if the current window is smaller
                min = Math.min(min, right - left);

                // Shrink the window from the left by subtracting the element at the left pointer
                sum -= nums[left];
                left++;
            }
        }

        // If no valid subarray was found, return 0, otherwise return the minimum length
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
