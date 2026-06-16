class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'&&j>0){
                sb.deleteCharAt(j-1);
                j--;
            }
            else if(s.charAt(i)=='*'&& j==0){
                continue;
            }
            else if(s.charAt(i)=='#'){
                String a =sb.toString();
                for(int k=0;k<a.length();k++){
                    sb.append(a.charAt(k));
                    j++;
                }
            }
            else if(s.charAt(i)=='%'){
                sb = sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
                j++;
            }
        }
        return sb.toString();
    }
}