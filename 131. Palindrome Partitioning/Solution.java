class Solution {
    List<List<String>> output = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s,0,new ArrayList<>());
        return output;
    }
    void dfs(String s, int n, List<String> list) {
        if (s.length() == n) {
            output.add(new ArrayList<>(list));
            return;
        }

        for (int i = n; i < s.length(); i++) {
            if (isPalindrome(s, n, i)) {
                list.add(s.substring(n, i+1));
                dfs(s, i+1, list);
                list.remove(list.size() - 1); 
            }
        }
    }
    boolean isPalindrome(String s, int n, int end) {
        while (n < end) {
            if (s.charAt(n) != s.charAt(end)) {
                return false;
            }

            n++;
            end--;
        }
        return true;
    }

}
