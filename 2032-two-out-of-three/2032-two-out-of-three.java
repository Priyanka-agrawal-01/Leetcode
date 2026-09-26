class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(nums1[0]);
        for(int i=1;i<nums1.length;i++){
            if(arr.get(arr.size()-1)==nums1[i]){
                continue;
            }else{
                arr.add(nums1[i]);
            }
        }

        int start = arr.size();

        arr.add(nums2[0]);
        for(int i=1;i<nums2.length;i++){
            if(arr.get(arr.size()-1)==nums2[i]){
                continue;
            }else{
                arr.add(nums2[i]);
            }
        }

        arr.add(nums3[0]);
        for(int i=1;i<nums3.length;i++){
            if(arr.get(arr.size()-1)==nums3[i]){
                continue;
            }else{
                arr.add(nums3[i]);
            }
        }

        Collections.sort(arr);

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr.size()-1;i++){

            if(arr.get(i)==arr.get(i+1)){

                if(ans.size()==0 || ans.get(ans.size()-1)!=arr.get(i)){
                    ans.add(arr.get(i));
                }
            }
        }

        if(arr.size()>0 && 
           (ans.size()==0 || ans.get(ans.size()-1)!=arr.get(arr.size()-1))){
            
            if(arr.size()>=2 && arr.get(arr.size()-1)==arr.get(arr.size()-2)){
                ans.add(arr.get(arr.size()-1));
            }
        }

        return ans;
    }
}