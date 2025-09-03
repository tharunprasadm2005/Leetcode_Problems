// Last updated: 03/09/2025, 10:09:18
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                return i;
            }
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}