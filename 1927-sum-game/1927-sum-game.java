class Solution {
    public boolean sumGame(String num) {
        int sum_f=0;
        int sum_b=0;
        int count_f=0;
        int count_b=0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?'){
                count_f+=1;
            }
            else{
                sum_f+=(int)(num.charAt(i)-'0');
            }
            if(num.charAt(num.length()-1-i)=='?'){
                count_b+=1;
            }
            else{
                sum_b+=(int)(num.charAt(num.length()-1-i)-'0');
            }
        }
        int diff = sum_f - sum_b;
        int qdiff = count_f - count_b;

        if(qdiff % 2 != 0) {
            return true;
        }

        if(diff == 0 && qdiff == 0) {
            return false;
        }

        if(qdiff == 0) {
            return diff != 0;
        }

        if(qdiff > 0) {
            return diff + (qdiff / 2) * 9 != 0;
        }
        else {
            return diff - ((-qdiff) / 2) * 9 != 0;
        }
    }
}