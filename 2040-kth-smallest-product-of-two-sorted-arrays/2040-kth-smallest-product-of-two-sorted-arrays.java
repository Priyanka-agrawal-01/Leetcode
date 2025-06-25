class Solution {
    public long countPairs(int[] nums1, int[] nums2, long mid) {
        long count = 0;
        for (int a : nums1) {
            if (a == 0) {
                if (mid >= 0) count += nums2.length;
            } else if (a > 0) {
                int l = 0, r = nums2.length;
                while (l < r) {
                    int m = (l + r) / 2;
                    if ((long)a * nums2[m] <= mid) l = m + 1;
                    else r = m;
                }
                count += l;
            } else {
                int l = 0, r = nums2.length;
                while (l < r) {
                    int m = (l + r) / 2;
                    if ((long)a * nums2[m] <= mid) r = m;
                    else l = m + 1;
                }
                count += (nums2.length - l);
            }
        }
        return count;
    }

    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        long left = -10000000000L, right = 10000000000L;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (countPairs(nums1, nums2, mid) < k)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
