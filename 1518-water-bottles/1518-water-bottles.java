class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emp = numBottles;
        int count = numBottles;
        while(emp-numExchange>=0){
            emp=emp-numExchange;
            emp++;
            count++;
            
        }
        return count;
    }
}