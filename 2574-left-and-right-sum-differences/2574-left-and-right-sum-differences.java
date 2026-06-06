class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left[] =new int[n];
        int right[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            left[i]=count; // 0 10 14 22
            count+=nums[i];
        }
        count=0;
        for(int i=n-1;i>=0;i--){
            right[i]=count; 
            count+=nums[i];
        }
        int arr[] =  new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Math.abs(left[i]-right[i]);
        }
        return arr;
    }
}