class Solution {
    public boolean check(int[] nums) {
        int val=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                val=i;
                break;
            }
        }
        for(int cnt = 1; cnt < nums.length; cnt++) {
            int i = (val + cnt) % nums.length;
            int prev = (i - 1 + nums.length) % nums.length;

            if(nums[prev] > nums[i]) {
                return false;
            }
        }
        return true;
    }
}