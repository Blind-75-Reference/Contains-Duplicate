import java.util.Hashtable;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        //solve problem here
        //K = element, V = index
        Map<Integer, Integer> integerMap = new Hashtable<>();
        integerMap.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++) {
            if(integerMap.put(nums[i], i) != null) {
                return true;
            }
        }

        return false;
    }

}
