/**
 * Created by Art1st on 17/10/15.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */
public class Solution1 {

    //my solution  t:O(n2) s:O(1)
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int first = 0;
        int second = 0;
        for (int i=0; i<length; i++) {
            first = nums[i];
            for (int j=i+1; j<length; j++) {
                second = nums[j];
                if (target == (first+second)) {
                    return new int[]{i, j};
                } else continue;
            }
        }
        return null;
    }

    //trade space for speed  t:O(n) s:O(n)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //t:O(n) s:O(n)
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int sum(int a, int b) {
        return a+b;
    }
}
