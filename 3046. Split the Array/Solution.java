class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        for (int i : counter.keySet()) {
            if (counter.get(i) > 2) {
                return false;
            }
        }
        return true;
    }
}
