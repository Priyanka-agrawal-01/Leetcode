class Solution {
    public int earliestFinishTime(int[] a, int[] b, int[] c, int[]d) {
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<c.length;j++){
                count=(a[i]+b[i]);
                if(count>=c[j]){
                    count+=d[j];
                }
                else{
                    count=d[j]+c[j];
                }
                min=Math.min(count,min);
            }
            count=0;
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<a.length;j++){
                count=(c[i]+d[i]);
                if(count>=a[j]){
                    count+=b[j];
                }
                else{
                    count=b[j]+a[j];
                }
                min=Math.min(count,min);
            }
            count=0;
        }
        return min;
    }
}