class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            hm.put(text.charAt(i), hm.getOrDefault(text.charAt(i), 0) + 1);
        }

        int count = 0;

        while (true) {
            if (hm.getOrDefault('b', 0) >= 1 &&
                hm.getOrDefault('a', 0) >= 1 &&
                hm.getOrDefault('l', 0) >= 2 &&
                hm.getOrDefault('o', 0) >= 2 &&
                hm.getOrDefault('n', 0) >= 1) {

                count++;

                hm.put('b', hm.get('b') - 1);
                hm.put('a', hm.get('a') - 1);
                hm.put('l', hm.get('l') - 2);
                hm.put('o', hm.get('o') - 2);
                hm.put('n', hm.get('n') - 1);
            } else {
                break;
            }
        }

        return count;
    }
}