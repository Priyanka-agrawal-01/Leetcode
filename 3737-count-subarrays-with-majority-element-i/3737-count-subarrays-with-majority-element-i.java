class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    count++;
                }
                int len=j-i+1;
                if(count>len/2){
                    ans++;
                }    
            }
            count=0;
        }
        return ans;
    }
}