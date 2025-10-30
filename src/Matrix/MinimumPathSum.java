class Solution {
    public int minPathSum(int[][] grid) {
        int n =grid.length; int m=grid[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int top = i-1<0?Integer.MAX_VALUE : grid[i-1][j];
                int bottom = j-1<0?Integer.MAX_VALUE : grid[i][j-1];
                int min=top==Integer.MAX_VALUE&& bottom==Integer.MAX_VALUE?0:Math.min(top,bottom);
                grid[i][j]+=min;
            }
        }
        return grid[n-1][m-1];
    }
}
