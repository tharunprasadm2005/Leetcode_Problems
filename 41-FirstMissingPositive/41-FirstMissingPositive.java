// Last updated: 03/09/2025, 10:09:13
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=1;
        for(int num: nums){
            if(num==n){
                n++;
            }
        }
        return n;
    }
}