class Solution {
    public double angleClock(int hour, int minutes) {
        double n = Math.abs(30*hour -5.5*minutes);
        return Math.min(n,360-n);
    }
}