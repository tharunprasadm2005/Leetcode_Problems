// Last updated: 03/09/2025, 10:10:01
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int merged[]=new int[m+n];

        System.arraycopy(nums1,0,merged,0,m);
        System.arraycopy(nums2,0,merged,m,n);

        Arrays.sort(merged);

        int total=m+n;
        if(total%2==0){
            return (merged[total/2-1]+ merged[total/2])/2.0;
        }
        else{
            return merged[total/2];
        }
    }
}