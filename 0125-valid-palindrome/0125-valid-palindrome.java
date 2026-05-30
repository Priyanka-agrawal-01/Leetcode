class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
                if(Character.isLetterOrDigit(ch)){
                    sb.append(ch);
                }
        }
        for(int i=0;i<sb.length()/2;i++){
            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}