// Last updated: 03/09/2025, 10:08:11
class Solution {
    public int rob(int[] nums) {
        int size=nums.length;
        int [] money=new int[size];

        if(size==1){
            return nums[0];
        }
        else{
            money[0]=nums[0];
            money[1]=Math.max(nums[0],nums[1]);

            for(int ind=2;ind<size;ind++){
                money[ind]=Math.max(nums[ind]+money[ind-2],money[ind-1]);
            }
        }
        return money[size-1];
    }
}