class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<words.length;i++){
            int sum =0;
            for(char ch: words[i].toCharArray()){
                sum = sum + weights[ch-'a'];
            }
            sb.append((char)('z'-sum%26));
        }
        return sb.toString();
    }
}