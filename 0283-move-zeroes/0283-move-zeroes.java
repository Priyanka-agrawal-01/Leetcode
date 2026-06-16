class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            if(nums[i]==0){
                while(nums[j]==0 && j <nums.length-1){
                    j++;
                }
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }

        }
    }
}