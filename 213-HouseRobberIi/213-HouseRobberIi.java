// Last updated: 03/09/2025, 10:08:06
class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        if (size == 0) return 0;
        if (size == 1) return nums[0];
        int result1 = maxCost(nums, 0, size - 2);
        int result2 = maxCost(nums, 1, size - 1);
        return Math.max(result1, result2);
    }
    private int maxCost(int[] nums, int start, int end) {
        int n = end - start + 1;
        if (n == 1) return nums[start];
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[start + i]);
        }
        return dp[n - 1];
    }
}
