// Last updated: 03/09/2025, 10:08:03
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return (nums[nums.length-k]);
    }
}