// Last updated: 03/09/2025, 10:09:19
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0){ return new int[]{-1,-1}; }
        int start = 0;int end = nums.length -1 ;int mid;
        while (start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return Answer(nums,start,end,target);
            }
            if(target > nums[mid]){ start = mid+1; }
            else { end = mid-1; }
        }
        return new int[]{-1,-1};
    }

    public static int[] Answer(int[] a ,int i , int j, int t){
        while (a[i] != t || a[j] != t){
            if(a[i] != t){ i++; }
            if(a[j] != t){ j--; }
        }
        return new int[]{i,j};
    }
}