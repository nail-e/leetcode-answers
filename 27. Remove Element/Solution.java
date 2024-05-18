class Solution {
    public int removeElement(int[] nums, int val) {
        // Create priority queue
        Queue<Integer> resultQueue = new PriorityQueue<>(); 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                resultQueue.offer(nums[i]);
                nums[i] = -1;
            }
        }
        
        int j = 0;
        while(!resultQueue.isEmpty()) {
            nums[j] = resultQueue.poll();
    		j++;
    	}

        return j;

    }
}
