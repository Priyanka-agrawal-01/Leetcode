class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        int len = sb.length();
        while(sb.length()<k){
            for(int i=0;i<len;i++){
                sb.append((char)(sb.charAt(i)+1));
            }
            len=sb.length();
        }
        return sb.charAt(k-1);
    }
}