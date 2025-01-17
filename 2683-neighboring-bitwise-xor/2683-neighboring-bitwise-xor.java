class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum=0;
        for(int nums:derived) sum^=nums;
 return sum==0;   }
}