class Solution {
    public int totalNumbers(int[] digits) {
        int curr1=0;
        int curr2=0;
        int curr3=0;
        int n=digits.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||j==k||k==i) continue;
                    curr1=(digits[i]*100)+(digits[j]*10)+digits[k];
                    curr2=(digits[j]*100)+(digits[k]*10)+digits[i];
                    curr3=(digits[k]*100)+(digits[i]*10)+digits[j];
                    if(curr1%2==0 && curr1>=100){
                        hs.add(curr1);
                    }
                    if(curr2%2==0 && curr2>=100){
                        hs.add(curr2);
                    }
                    if(curr3%2==0 && curr3>=100){
                        hs.add(curr3);
                    }
                }
            }
        }
        return hs.size();
    }
}