class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                hm.put(s.charAt(i),1);
            }
            if(s.charAt(i)=='V'){
                hm.put(s.charAt(i),5);
            }
            if(s.charAt(i)=='X'){
                hm.put(s.charAt(i),10);
            }
            if(s.charAt(i)=='L'){
                hm.put(s.charAt(i),50);
            }
            if(s.charAt(i)=='C'){
                hm.put(s.charAt(i),100);
            }
            if(s.charAt(i)=='D'){
                hm.put(s.charAt(i),500);
            }
            if(s.charAt(i)=='M'){
                hm.put(s.charAt(i),1000);
            }
        }
        int count =0;
        for(int i=0;i<s.length()-1;i++){
            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){
                count=count-hm.get(s.charAt(i));
            }
            else{
                count=count+hm.get(s.charAt(i));
            }
        }
        count=count+hm.get(s.charAt(s.length()-1));
        return count;
    }
}