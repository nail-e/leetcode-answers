import java.util.HashMap;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] scoreCopy = new int[n];
        String[] ranks = new String[n];
        System.arraycopy(score, 0, scoreCopy, 0, n);

        HashMap<Integer, Integer> scoreToIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            scoreToIndex.put(scoreCopy[i], i);
        }

        Arrays.sort(scoreCopy);

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ranks[scoreToIndex.get(scoreCopy[n - i - 1])] = "Gold Medal";
            } else if (i == 1) {
                ranks[scoreToIndex.get(scoreCopy[n - i - 1])] = "Silver Medal";
            } else if (i == 2) {
                ranks[scoreToIndex.get(scoreCopy[n - i - 1])] = "Bronze Medal";
            } else {
                ranks[scoreToIndex.get(scoreCopy[n - i - 1])] = Integer.toString(i + 1);
            }
        }
        return ranks;
    }
}
