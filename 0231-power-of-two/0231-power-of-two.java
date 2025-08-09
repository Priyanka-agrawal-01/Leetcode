class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0;
        while(i<=Math.sqrt(n)+5){
            if(Math.pow(2,i)==n){
                return true;
            }
            else{
                i++;
            }
            
        }
        return false;
    }
}