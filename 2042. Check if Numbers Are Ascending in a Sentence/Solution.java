class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        Queue<Integer> knownIndex = new LinkedList<>();
        int numCount = 0;
        for (int i = 0; i < words.length; i++) {
            if (isInteger(words, i)) {
                numCount++;
                knownIndex.add(Integer.parseInt(words[i]));
            }
        }

        int[] nums = new int[numCount];
        int j = 0;
        while (!knownIndex.isEmpty()) {
            nums[j] = knownIndex.poll();
            j++;
        } 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) { 
                return false;
            } 
        }
        return true;
    }

    public static boolean isInteger(String[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            try {
                Integer.parseInt(arr[index]);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }
}

