// Last updated: 03/09/2025, 10:07:36
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int[] result = new int[size]; 
        for (int i = 0; i < size; i++) {
            int next = -1;  
            for (int j = (i + 1) % size; j != i; j = (j + 1) % size) {
                if (nums[i] < nums[j]) {
                    next = nums[j];
                    break;
                }
            }
            result[i] = next;  
        }
        return result;
    }
}
