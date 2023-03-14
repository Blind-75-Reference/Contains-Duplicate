import java.util.Hashtable;
import java.util.Map;

public class Solution {
    /*
    This solution will use the properties of HashTable to do all the work for us. Recall that HashTable is a Map
    data structure backed by a hash table, and holds kay/value pairs. The trick here is to understand what happens
    when we try to insert a key which already exists in the HashTable. Every key is unique in a HashTable. So, if we
    try to add a key/value pair with a key that is already present, the method will return the value that was previously
    associated with that key, otherwise it returns null. This means that as we add pairs to the map, if we get anything
    other than a null value back, that key was already present. We will use the elements as keys, and their indices as
    values.
     */
    public boolean containsDuplicate(int[] nums) {
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
