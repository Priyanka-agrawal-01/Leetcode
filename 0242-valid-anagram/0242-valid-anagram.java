class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            hp.put(t.charAt(i),hp.getOrDefault(t.charAt(i),0)+1);
        }
        return hm.equals(hp);
    }
}