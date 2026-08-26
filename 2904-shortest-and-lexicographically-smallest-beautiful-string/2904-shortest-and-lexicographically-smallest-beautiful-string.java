class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int len = Integer.MAX_VALUE;
        for(int it=0;it<s.length();it++){
            for(int i =it;i<s.length();i++){
                StringBuilder sb = new StringBuilder();
                int count=0;
                int j=it;
                while(count<k && j<=i){
                    sb.append(s.charAt(j));
                    if(s.charAt(j)=='1') count++;
                    j++;
                }
                if(count == k) {
                    if(sb.length() < len ||(sb.length() == len && sb.toString().compareTo(ans.toString()) < 0)) {

                        len = sb.length();
                        ans = new StringBuilder(sb);
                    }
                }   
            }
        }
        return ans.toString();
    }
}