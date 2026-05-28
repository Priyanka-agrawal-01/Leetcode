class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int count=0;
        int arr[] = new int[k];
        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for (int i = 0; i < k; i++) {
            int maxValueInMap = Collections.max(hm.values());
            int element = 0;
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                if (entry.getValue() == maxValueInMap) {
                    element = entry.getKey();
                    break;
                }
            }
            arr[i] = element;
            hm.remove(element);
        }
        return arr;
    }
}