class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        if(nums.length==1) return nums[0]*nums[0];
        long count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length/2){
                count-=Math.pow(nums[i],2);
            }
            else count+=Math.pow(nums[i],2);
        }
        return count;
    }
}