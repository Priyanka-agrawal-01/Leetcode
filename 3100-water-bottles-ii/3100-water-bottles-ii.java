class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int filled = numBottles;
        int empty=numBottles;
        while(filled>=numExchange){
            filled=filled-numExchange;
            numExchange++;
            filled++;
            empty++;
        }
        return empty;
    }
}