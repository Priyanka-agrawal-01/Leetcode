class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] shiftArray = new int[s.length() + 1]; 
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;

            shiftArray[start] += direction;
            shiftArray[end + 1] -= direction;
        }

        int cumulativeShift = 0;
        char[] result = s.toCharArray();

        for (int i = 0; i < result.length; i++) {
            cumulativeShift += shiftArray[i];
            int shift = (cumulativeShift % 26 + 26) % 26;
            result[i] = (char) ((result[i] - 'a' + shift) % 26 + 'a');
        }

        return new String(result);
    }
}
