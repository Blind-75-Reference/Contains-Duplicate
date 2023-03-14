import java.util.Arrays;

public class Solution {
    /*
    This solution first sorts the array, making it easy to determine if there are duplicates. Instead of looping through
    the array multiple times in nested loops, we only need to pass through it once considering the next element. If
    any two adjacent elements are the same value, we have found duplicates and return true. If we finish the loop
    with no duplicates, we return false.

    This adds the complexity of sorting the array, but makes the rest of the solution far more efficient than the
    brute force solution. 
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

}
