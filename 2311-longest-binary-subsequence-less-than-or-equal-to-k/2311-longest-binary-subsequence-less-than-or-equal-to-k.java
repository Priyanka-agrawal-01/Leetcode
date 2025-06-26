class Solution {
    public int longestSubsequence(String s, int k) {
        int len = s.length();
        int count = 0;
        long value = 0;
        int power = 0;

    
        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '0') {
                count++;
            } else {
                if (power < 32) { 
                    long addition = 1L << power;
                    if (value + addition <= k) {
                        value += addition;
                        count++;
                    }
                }
            }
            power++;
        }

        return count;
    }
}
