package arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {
    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void containsDuplicateShouldReturnTrue() {
        int[] nums = {1, 2, 3, 1};
        var result = containsDuplicate.checkIfDuplicate(nums);
        Assertions.assertTrue(result);
    }

    @Test
    void containsDuplicateShouldReturnFalse() {
        int[] nums = {1, 2, 3 };
        var result = containsDuplicate.checkIfDuplicate(nums);
        Assertions.assertFalse(result);
    }
}