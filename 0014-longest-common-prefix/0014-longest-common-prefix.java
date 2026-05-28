class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        char arr[] = strs[0].toCharArray();
        StringBuilder sb =new StringBuilder("");
        
        int min=201;
        for(int i=1;i<strs.length;i++){
            int count =0;
            for(int j=0;j<Math.min(arr.length,strs[i].length());j++){
                if(arr[j]==strs[i].charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            min = Math.min(count,min);
        }
        for(int i=0;i<min;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}