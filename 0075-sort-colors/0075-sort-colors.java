class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        for(int i=left;i<=right;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
            else if(nums[i]==2){
                int temp=nums[i]; //2
                nums[i]=nums[right];
                nums[right]=temp;
                right--;
                i--;
            }
            else continue;
        }
    }
}