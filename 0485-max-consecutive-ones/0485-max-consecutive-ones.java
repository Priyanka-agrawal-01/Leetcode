class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(count,max);
                count=0;
            }
            else{
                count++;
            }
        }
        if(max>count){
            return max;
        }
        return count;
    }
}