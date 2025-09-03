// Last updated: 03/09/2025, 10:09:30
class Solution {
    public int removeDuplicates(int[] nums) {
         int k = 0;
        for (int x : nums) {
            if (k == 0 || x != nums[k - 1]) {
                nums[k++] = x;
            }
        }
        return k;
    }
}