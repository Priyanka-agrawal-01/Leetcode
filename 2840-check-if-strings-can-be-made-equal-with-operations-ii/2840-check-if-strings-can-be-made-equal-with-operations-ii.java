class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] freq = new int[52];

        for (int i = 0; i < s1.length(); i++) {
            int count = (i & 1) * 26;
            freq[s1.charAt(i) - 'a' + count]++;
            freq[s2.charAt(i) - 'a' + count]--;
        }

        for (int i = 0; i < 52; i++)
            if (freq[i] != 0) return false;

        return true;
    }
}