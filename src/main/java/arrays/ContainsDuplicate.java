package arrays;

import java.util.*;

public class ContainsDuplicate {

    public Boolean checkIfDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Iterate through the array and try to add elements to the set
        // If an element is already in the set, a duplicate exists
        for(int num : nums) {
            if(!set.add(num))
                return true;
        }
        // Return false if no duplicates are found
        return false;
    }
}
