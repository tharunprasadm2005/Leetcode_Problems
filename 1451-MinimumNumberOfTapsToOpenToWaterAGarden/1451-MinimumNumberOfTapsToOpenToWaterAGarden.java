// Last updated: 03/09/2025, 10:07:26
class Solution {
  public int minTaps(int n, int[] ranges) {
    int[] nums = new int[n+1];
    for(int i =0; i<=n;++i){
      int l = Math.max(0,i-ranges[i]);
      int r = Math.min(n,i+ranges[i]);
      nums[l] = Math.max(nums[l], r-l);
    }
    int res=0;
    int end =0;
    int maxDist = 0;
    for(int i=0;i<n;i++){
      maxDist = Math.max(maxDist, i+nums[i]);
      if(i ==end){
        ++res;
        end = maxDist;
      }
    }
    return end == n ? res : -1;
  }
}







