package arrays;

public class SearchInsertPosition {

    // Method to search for the insert position of the target in the array
    public int searchInsert(int nums[], int target) {

        // Check if the array is null or empty
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // If the target is less than the first element, return 0 (insert at the start)
        if (target < nums[0]) {
            return 0;
        }

        // If the target is greater than the last element, return the index after the last
        if (target > nums[nums.length - 1]) {
            int index = nums.length - 1;
            return index + 1;
        }

        // Iterate through the array to find the correct insert position
        for (int i = 0; nums.length > i; i++) {
            // If the target matches the current element, return its index
            if (nums[i] == target) {
                return i;
            }
            // If the current element is greater than the target, return the current index
            else if (nums[i] > target) {
                return i;
            }
        }
        return 0;
    }
}

