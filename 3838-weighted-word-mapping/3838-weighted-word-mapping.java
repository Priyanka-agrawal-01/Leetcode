class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<words.length;i++){
            char arr[] =words[i].toCharArray();
            int sum =0;
            for(int k=0;k<arr.length;k++){
                sum = sum + weights[arr[k]-'a'];
            }
            sb.append((char)('z'-sum%26));
        }
        return sb.toString();
    }
}