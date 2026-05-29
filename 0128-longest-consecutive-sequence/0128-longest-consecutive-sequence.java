class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for(int n:nums){
            hm.add(n);
        }
        int longest=0;
        for(int n: hm){
            if(!hm.contains(n-1)){
                int length=1;
                while(hm.contains(n+length)){
                    length++;
                }
                longest=Math.max(longest,length);
            }
            
        }
        return longest;
    }
}