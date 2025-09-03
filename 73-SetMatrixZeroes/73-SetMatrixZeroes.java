// Last updated: 03/09/2025, 10:08:56
class Solution {
    void zeroFunction(int[][] matrix, int row, int col){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<m;i++){
            matrix[row][i]=0;
        }
        for(int i=0;i<n;i++){
            matrix[i][col]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Pair<Integer, Integer>> dp = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0) dp.add(new Pair<>(i, j));
            }
        }
        for(Pair<Integer, Integer> p : dp){
            zeroFunction(matrix, p.getKey(), p.getValue());
        }
        return;
    }
}