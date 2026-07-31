class Solution {
    public int minimumPushes(String word) {
        int count=0;
        int result=0;
        int mul=1;
        int freq[]= new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        for(int i=25;i>=0;i--){
            if(count==8){
                mul+=1;
                count=0;
            }
            result= result+(freq[i]*mul);
            count++;
        }
        return result;
    }
}