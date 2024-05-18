
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] resultsArray = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                resultsArray[0] = map.get(complement);
                resultsArray[1] = i;
                return resultsArray;
            }
            map.put(nums[i], i);
        }   
        return null;
    }
}

