class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashSet <String> hs = new HashSet<>();
        for(int i=0;i<word.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<word.length();j++){
                sb.append(word.charAt(j));
                hs.add(sb.toString());
            }
        }
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(hs.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}