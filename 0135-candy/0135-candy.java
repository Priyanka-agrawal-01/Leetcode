class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int arr[] = new int[n];
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        arr[0]=1;
        for(int i=1;i<n;i++){
            arr[i]++;
            if(ratings[i-1]<ratings[i]&&arr[i-1]>=arr[i]){
                while(arr[i]<=arr[i-1]){
                    arr[i]++;
                }
            }
            else if(ratings[i-1]>ratings[i]&&arr[i-1]<=arr[i]){
                while(arr[i]>=arr[i-1]){
                    arr[i-1]++;
                }
            }
            else{
                continue;
            }
        }
        return sum(check(arr,ratings));
    }
    public int sum(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=count+arr[i];
        }
        return count;
    }
    public int[] check(int arr[],int nums[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(nums[n-i]<nums[n-i-1]&&arr[n-i]>=arr[n-i-1]){
                while(arr[n-i-1]<=arr[n-i]){
                    arr[n-i-1]++;
                }
            }
            else if(nums[n-i]>nums[n-i-1]&&arr[n-i]<=arr[n-i-1]){
                while(arr[n-i-1]>=arr[n-i]){
                    arr[n-i]++;
                }
            }
            else{
                continue;
            }
        }
        return arr;
    }
}