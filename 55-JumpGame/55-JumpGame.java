// Last updated: 03/09/2025, 10:09:10
class Solution {
    public boolean canJump(int[] nums) {
        int reachable=0;
        for(int i=0;i<nums.length;i++){
            if(i>reachable)
                return false;
            reachable= Math.max(reachable,i+nums[i]);
        }
        return true;
    }
}