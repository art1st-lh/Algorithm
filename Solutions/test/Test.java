import static org.junit.Assert.assertEquals;

/**
 * Created by Art1st on 17/10/15.
 */
public class Test {

    @org.junit.Test
    public void testSolution1(){
        int[] source = {-3,4,3,90};
        int target = 0;
        int[] result = {0,2};
        assertEquals(result, new Solution1().twoSum(source,target));
    }

    @org.junit.Test (timeout = 1)
    public void testSum(){
        assertEquals(3,new Solution1().sum(1,2));
    }

    public void testSolution283() {

    }

}
