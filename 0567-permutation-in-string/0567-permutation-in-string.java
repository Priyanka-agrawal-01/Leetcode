class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1); // a 1 b 1
        }

        int left = 0;
        int count = s1.length(); // count =2

        for (int right = 0; right < s2.length(); right++) {
            // 0 1   2 3 4 5 
            char ch = s2.charAt(right); // ch =e ch=i

            if (hm.containsKey(ch)) {
                if (hm.get(ch) > 0) {
                    count--;
                }
                hm.put(ch, hm.get(ch) - 1);
            }

            while (right - left + 1 > s1.length()) { //1<2 2=2     3>2
                char remove = s2.charAt(left); // e

                if (hm.containsKey(remove)) {
                    hm.put(remove, hm.get(remove) + 1);

                    if (hm.get(remove) > 0) {
                        count++;
                    }
                }
                left++; // 1
            }

            if (count == 0) {
                return true;
            }
        }

        return false;
    }
}