class Solution {
    public boolean isValid(String s) {
        if(s.length()<3){
            return false;
        }
        int count =0;
        int num=0;
        int a=0;
        for(int i=0;i<s.length();i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                return false;
            }
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
            else if(Character.isLetter(s.charAt(i))){
                num++;
            }
            else if(Character.isDigit(s.charAt(i))){
                a++;
            }
            else{
                return false;
            }
        }
        if(num>0&&count>0){
            return true;
        }
        else{
            return false;
        }
    }
}