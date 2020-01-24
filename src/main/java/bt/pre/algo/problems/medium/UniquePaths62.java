package bt.pre.algo.problems.medium;

/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
 */
public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[n][m];
        for (int c = 0; c < m; c++) {
            grid[0][c] = 1;
        }
        for (int r = 0; r < n; r++) {
            grid[r][0] = 1;
        }
        for (int r = 1; r < n; r++) {
            for (int c = 1; c < m; c++) {
                grid[r][c] = grid[r - 1][c] + grid[r][c - 1];
            }
        }
        return grid[n - 1][m - 1];
    }
}
