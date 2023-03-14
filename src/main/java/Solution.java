public class Solution {
    /*
    This brute force solution contains a for loop nested within a for loop. The outer loop iterates through the array,
     and the inner loop considers that element against all others. Nested for loops indicate we are probably running in
     O(n^2) time, which is hardly optimal. Once we find a match, we know we have at least one duplicate, and we return
     true. If the loops complete without finding any suplicates, we return false.
     */
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
