class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        int ans=0;
        for (int right=0;right<nums.length;right++){
            count+=nums[right];
            while (count >= target) {
                min=Math.min(min,right - left + 1);
                count=count-nums[left];
                left++;
            }

        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}