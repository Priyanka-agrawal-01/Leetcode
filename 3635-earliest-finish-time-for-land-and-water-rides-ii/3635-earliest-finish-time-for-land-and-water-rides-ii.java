class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans1= calc(landStartTime, landDuration, waterStartTime, waterDuration);
        int ans2= calc(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(ans1, ans2);
    }
    private int calc(int[] s1, int[] d1, int[] s2, int[] d2){
        int min_end= Integer.MAX_VALUE;
        for(int i=0; i<s1.length; i++){
            int fin= s1[i]+d1[i];
            if(fin<min_end){
                min_end=fin;
            }
        }
        int ans= Integer.MAX_VALUE;
        for(int i=0; i<s2.length; i++){
            int fin_t= Math.max(min_end, s2[i])+d2[i];
            if(fin_t<ans){
                ans=fin_t;
            }
        }
        return ans;     
    }
}