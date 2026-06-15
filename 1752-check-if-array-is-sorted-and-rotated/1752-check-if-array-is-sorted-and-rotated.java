class Solution {
    public boolean check(int[] nums) {
        int val=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                val=i;
                break;
            }

        }
        for(int i=1;i<nums.length;i++){
            int curr =(i+val)%nums.length;
            int prev= (curr-1+nums.length)%nums.length;
            if(nums[prev]>nums[curr]){
                return false;
            }
        }
        return true;
    }
}