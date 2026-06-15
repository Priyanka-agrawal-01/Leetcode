class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); //3 6 9
        int arr[]= new int[nums.length]; 
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i]; //3 9 18
            arr[i]=sum; //3 9 18
        }
        int max=0;
        for(int i=0;i<nums.length /*3*/;i++){
            int left=0;
            int right=i+1; //0
            int result=0;
            while(left<=right){ //0=0
                int mid=left + (right-left)/2; // 0
                int count =i-mid+1; // 1
                int windowsum=count*nums[i]; //3
                int curr=arr[i]-arr[mid]+nums[mid];
                if(windowsum-curr>k){ 
                    left=mid+1;
                }else{ 
                    result=mid;
                    right = mid-1;
                }
            }
            max=Math.max(max,i-result+1);
        }
        return max;
    }
}