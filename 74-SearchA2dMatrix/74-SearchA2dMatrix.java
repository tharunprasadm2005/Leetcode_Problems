// Last updated: 03/09/2025, 10:08:55
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int r=0,c=m-1;
        while(r<n && c>=0)
        {
            if(matrix[r][c]==target)
                return true;
            else if(target<matrix[r][c])
                c--;
            else
                r++;
        }
        return false;
    }
}