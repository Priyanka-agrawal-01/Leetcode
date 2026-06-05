class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int res = 0, i = 0, maxFreq = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j); // A 
            hm.put(c, hm.getOrDefault(c, 0) + 1); // A 2 B 2
            maxFreq = Math.max(maxFreq, hm.get(c)); // 2

            while ((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                hm.put(left, hm.get(left) - 1);
                i++;
            }

            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}