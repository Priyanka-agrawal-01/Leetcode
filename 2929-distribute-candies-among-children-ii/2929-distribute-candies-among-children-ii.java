class Solution {
    public long distributeCandies(int n, int limit) {
        if (n > 3 * limit) return 0;
        return countWays(n, limit);
    }
    
    private long nCr(long n, int r) {
        if (n < r) return 0;
        if (r == 0) return 1;
        if (r == 1) return n;
        return n * (n - 1) / 2;
    }
    
    private long countWays(int n, int limit) {
        long res = 0;
        for (int k = 0; k <= 3; k++) {
            long sign = (k % 2 == 0) ? 1 : -1;
            long val = n - k * (limit + 1) + 2;
            long comb = nCr(val, 2);
            long term = sign * combination(3, k) * comb;
            res += term;
        }
        return res;
    }
    
    private long combination(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        if (r == 1) return n;
        return n * (n - 1) / 2;
    }
}
