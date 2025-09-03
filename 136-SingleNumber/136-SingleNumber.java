// Last updated: 03/09/2025, 10:08:20
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> arr = new HashMap<>();
        for(int num : nums)
            arr.put(num, arr.getOrDefault(num, 0) + 1);
        for(Map.Entry<Integer, Integer> value : arr.entrySet())
            if(value.getValue() == 1)
                return value.getKey();
        return 0;
    }
}
