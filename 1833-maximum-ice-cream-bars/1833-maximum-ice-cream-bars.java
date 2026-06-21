class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max =Integer.MIN_VALUE;
        for(int i=0;i<costs.length;i++){
            max=Math.max(costs[i],max);
        }
        int count[] =new int[max+1];
        for(int i=0;i<costs.length;i++){
            count[costs[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                costs[j]=i;
                j++;
                count[i]--;
            }
        }
        int ans=0;
        int maxi=0;
        for(int i=0;i<costs.length;i++){
            if(ans + costs[i] <= coins){
                ans += costs[i];
                maxi++;
            }else{
                break;
            }
        }
        return maxi;
    }
}