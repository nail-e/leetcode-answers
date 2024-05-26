import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
                int currentValue = roman.get(current);
                if (i < s.length() - 1 && roman.get(s.charAt(i + 1)) > currentValue) {
                    output -= currentValue;
                } else {
                    output += currentValue;
                }
        }
        return output;
    }
}

