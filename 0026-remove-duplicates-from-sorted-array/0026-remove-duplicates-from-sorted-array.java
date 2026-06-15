class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<1) return 0;
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1]=101;
            }
            else{
                count++;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}