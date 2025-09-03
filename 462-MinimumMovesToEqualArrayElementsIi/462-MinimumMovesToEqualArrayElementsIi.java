// Last updated: 03/09/2025, 10:07:38
class Solution {
    public int minMoves2(int[] nums) {
        int ind;
        int mid=nums.length/2;
        Arrays.sort(nums);
        int sum=0;
        for(ind=0;ind<mid;ind++){
            sum+=nums[mid]-nums[ind];
        }
        for(ind=mid;ind<nums.length;ind++){
            sum+=nums[ind]-nums[mid];
        }
        return sum;
    }
}