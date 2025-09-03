// Last updated: 03/09/2025, 10:08:52
class Solution {
    public boolean search(int[] nums, int target) {
        int start =0, end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return true;
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }

            else if(nums[start] <= nums[mid]){              
                if(nums[start] <= target &&  target <= nums[mid]){      
               
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{                                            
                if(nums[mid] <= target && nums[end] >= target){
                    
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }

            }
       }
       return false;
    }
}