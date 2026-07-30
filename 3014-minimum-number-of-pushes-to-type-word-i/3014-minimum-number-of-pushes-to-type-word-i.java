class Solution {
    public int minimumPushes(String word) {
        int count=0;
        int mul=1;
        int ans =0;
        for(int i=0;i<word.length();i++){
            if(count==8){
                mul+=1;
                count=0;
            }
            ans+=mul;
            count++;
        }
        return ans;
    }
}