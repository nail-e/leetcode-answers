class Solution {
    public boolean isPalindrome(String s) {
        return isPalindromeHelper(s.toLowerCase(), 0, s.length() - 1);
    }
    
    private boolean isPalindromeHelper(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        char charStart = s.charAt(start);
        char charEnd = s.charAt(end);
        
        if (!Character.isLetterOrDigit(charStart)) {
            return isPalindromeHelper(s, start + 1, end);
        } else if (!Character.isLetterOrDigit(charEnd)) {
            return isPalindromeHelper(s, start, end - 1);
        } else {
            if (charStart != charEnd) {
                return false;
            }
            return isPalindromeHelper(s, start + 1, end - 1);
        }
    }
}

