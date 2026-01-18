class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Prefix sums
        int[][] rowPrefix = new int[m][n + 1];
        int[][] colPrefix = new int[m + 1][n];

        // Build prefix sums
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowPrefix[i][j + 1] = rowPrefix[i][j] + grid[i][j];
                colPrefix[i + 1][j] = colPrefix[i][j] + grid[i][j];
            }
        }

        int maxSize = 1;

        // Try all square sizes
        for (int size = 2; size <= Math.min(m, n); size++) {
            for (int i = 0; i + size <= m; i++) {
                for (int j = 0; j + size <= n; j++) {

                    if (isMagic(grid, rowPrefix, colPrefix, i, j, size)) {
                        maxSize = size;
                    }
                }
            }
        }
        return maxSize;
    }

    private boolean isMagic(int[][] grid, int[][] rowP, int[][] colP,
                            int r, int c, int size) {

        // First row sum as target
        int target = rowP[r][c + size] - rowP[r][c];

        // Check all rows
        for (int i = r; i < r + size; i++) {
            int rowSum = rowP[i][c + size] - rowP[i][c];
            if (rowSum != target) return false;
        }

        // Check all columns
        for (int j = c; j < c + size; j++) {
            int colSum = colP[r + size][j] - colP[r][j];
            if (colSum != target) return false;
        }

        // Main diagonal
        int diag1 = 0;
        for (int i = 0; i < size; i++) {
            diag1 += grid[r + i][c + i];
        }
        if (diag1 != target) return false;

        // Anti diagonal
        int diag2 = 0;
        for (int i = 0; i < size; i++) {
            diag2 += grid[r + i][c + size - 1 - i];
        }
        return diag2 == target;
    }
}
