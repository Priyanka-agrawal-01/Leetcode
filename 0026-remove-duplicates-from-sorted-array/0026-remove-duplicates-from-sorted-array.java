class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<1) return 0;
        int count =0;
        for(int i=1;i<nums.length;i++){
            if(nums[count]!=nums[i]){
                nums[count+1]=nums[i];
                count++;
            }
        }
        return count+1;
    }
}