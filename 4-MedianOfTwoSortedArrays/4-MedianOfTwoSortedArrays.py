# Last updated: 03/09/2025, 10:10:05
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1
        
        m, n = len(nums1), len(nums2)
        total_len = m + n
        half_len = (total_len + 1) // 2
        
        left, right = 0, m
        while left <= right:
            partition1 = (left + right) // 2
            partition2 = half_len - partition1
            
            max_left1 = float('-inf') if partition1 == 0 else nums1[partition1 - 1]
            min_right1 = float('inf') if partition1 == m else nums1[partition1]
            
            max_left2 = float('-inf') if partition2 == 0 else nums2[partition2 - 1]
            min_right2 = float('inf') if partition2 == n else nums2[partition2]
            
            
            if max_left1 <= min_right2 and max_left2 <= min_right1:
                
                if total_len % 2 == 1:
                    return max(max_left1, max_left2)
                
                return (max(max_left1, max_left2) + min(min_right1, min_right2)) / 2.0
            
            
            elif max_left1 > min_right2:
                right = partition1 - 1
            else:
                left = partition1 + 1
        
        raise ValueError("Input arrays are not sorted.")