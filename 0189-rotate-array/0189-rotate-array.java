class Solution {
    public void rotate(int[] nums, int k) {
        int arr[] = new int[nums.length];
        k=k%nums.length;
        for(int i=0;i<nums.length;i++){
            int idx=(nums.length-k+i)%nums.length; 
            arr[i]=nums[idx];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}