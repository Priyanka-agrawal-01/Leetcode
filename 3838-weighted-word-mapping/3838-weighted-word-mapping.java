class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        HashMap <Character,Integer> hm =new HashMap<>();
        int j=0;
        for(char i='a';i<='z';i++){
            hm.put(i,weights[j]);
            j++;
        }
        for(int i=0;i<words.length;i++){
            char arr[] =words[i].toCharArray();
            int sum =0;
            for(int k=0;k<arr.length;k++){
                sum = sum + (int)hm.get(arr[k]);
            }
            sb.append(map(sum%26));
        }
        return sb.toString();
    }
    public char map(int n){
        if(n==0) return 'z';
        else return (char)('z'-n);    
    }
}