class Solution {
    public void rotate(int[] nums, int k) {
        int arr[] = new int[nums.length];
        k=k%nums.length;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            idx=Math.abs((nums.length-k+i))%nums.length; 
            arr[i]=nums[idx];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}