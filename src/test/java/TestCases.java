import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        boolean actual = solution.containsDuplicate(new int[]{1,2,3,1});
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        boolean actual = solution.containsDuplicate(new int[]{1,2,3,4});
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        boolean actual = solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }


}
