// Last updated: 03/09/2025, 10:07:50
class Solution {
    public int numSquares(int n) {
        int[] countDp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            countDp[i] = Integer.MAX_VALUE;
        }        
        countDp[0] = 0; 
        for (int num = 1; num <= n; num++) {
            for (int val = 1; val * val <= num; val++) {    
                countDp[num] = Math.min(countDp[num], countDp[num - val * val] + 1);
            }
        }       
        return countDp[n];
    }
}
