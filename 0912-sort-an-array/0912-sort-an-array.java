class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int curr=nums[i]; // 3
            int prev = i-1; //1
            while(prev>=0 && curr<nums[prev]){ //3 2
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1] = curr; //5
        }
        return nums;// 2 5 3 1
    }
}