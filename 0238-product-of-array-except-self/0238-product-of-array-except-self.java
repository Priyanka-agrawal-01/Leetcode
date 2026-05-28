class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre_arr[]=new int[n];
        int suff_arr[]=new int[n];
        int arr[] = new int[n];
        int curr=1;
        for(int i=0;i<n;i++){
            pre_arr[i]=curr;
            curr=curr*nums[i];
        }
        curr=1;
        for(int i=n-1;i>=0;i--){
            suff_arr[i]=curr;
            curr=curr*nums[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=pre_arr[i]*suff_arr[i];
        }
        return arr;
    }
}