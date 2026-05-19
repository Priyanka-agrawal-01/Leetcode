class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet <Integer> hs = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            hs.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(hs.contains(nums1[i])){
                return nums1[i];
            }
        }
        return -1;
    }
}