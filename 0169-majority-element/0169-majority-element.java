class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int max=Collections.max(hm.values());
        int ans=0;
        for(Integer key:hm.keySet()){
            int curr = hm.get(key);
            if(curr==max){
                ans=key;
            }
        }
        return ans;

    }
}