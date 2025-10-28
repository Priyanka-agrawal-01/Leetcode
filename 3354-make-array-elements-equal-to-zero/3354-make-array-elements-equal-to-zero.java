class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int x : nums) totalSum += x;

        int leftSum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (leftSum * 2 == totalSum) ans += 2;
                else if (Math.abs(leftSum * 2 - totalSum) == 1) ans += 1;
            }
            leftSum += nums[i];
        }
        return ans;
    }
}