package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myTable = new HashMap<>();
        // HashMap的方法：containsKey get put
        for (int i = 0; i < nums.length; i++){
            if (myTable.containsKey(target - nums[i])){
                return new int[] {i, myTable.get(target - nums[i])};
            }
            else {
                myTable.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
