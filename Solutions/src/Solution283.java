/**
 * Created by Art1st on 17/10/16.
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for(int i=0; i<length; i++) {
            for(int j=0; j<length-i-1; j++) {
                if(nums[j] != 0)
                    continue;
                else {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
