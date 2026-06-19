class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(sbb.length()>0){
                    sbb.reverse();
                    if(sb.length()>0) sb.append(" ");
                    sb.append(sbb);
                    sbb = new StringBuilder();
                }
            }
            else{
                sbb.append(s.charAt(i));
            }
        }
        if(sbb.length()!=0){
            sbb.reverse();
            if(sb.length()>0) sb.append(" ");
            sb.append(sbb);
        }
        return sb.toString();
    }
}