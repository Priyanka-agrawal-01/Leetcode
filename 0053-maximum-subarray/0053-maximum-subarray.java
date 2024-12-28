class Solution {
    public int maxSubArray(int[] n) {
       int ms=Integer.MIN_VALUE;
        int cs=0;

        for (int index = 0; index < n.length; index++) {
            cs=cs+n[index];
            ms=Math.max(ms,cs);
            if(cs<0){
                cs=0;
            }
        }
        return ms; 
    }
}