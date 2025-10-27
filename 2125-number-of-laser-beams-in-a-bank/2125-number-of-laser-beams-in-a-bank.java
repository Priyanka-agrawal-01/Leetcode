class Solution {
    public int numberOfBeams(String[] bank) {
        
        int[] laser =new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int count = 0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            laser[i]=count;
        }

        int output=0;
        int prev=0;
        for (int i = 0; i < laser.length; i++) {
            if (laser[i] > 0) {
                if (prev > 0) {
                    output += prev * laser[i];
                }
                prev = laser[i]; 
            }
        }
        return output;
    }
}