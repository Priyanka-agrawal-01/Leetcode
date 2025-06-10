class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int a1=0;
        int a2=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> set: hm.entrySet()){
            if(set.getValue()%2==0){
                a2=Math.min(a2,set.getValue());
            }else{
                a1=Math.max(a1,set.getValue());
            }
        }
        return a1-a2;
    }
}