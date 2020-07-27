package bt.pre.algo.problems.top.medium;

/**
 * {@link _14_KthSmallestElementBST}#kthSmallest()
 * 
 * @author BBADAR-C
 * @see _14_KthSmallestElementBST
 *
 */
public class _15_NumberOfIslands {
	char land = '1', water = '0', visited = '2';

	public int numIslands(char[][] grid) {

		// {@link _14_KthSmallestElementBST}
		int nums = 0;
		int nRows = grid.length;
		if (nRows == 0) {
			return 0;
		}
		int nCols = grid[0].length;
		for (int r = 0; r < nRows; r++) {
			for (int c = 0; c < nCols; c++) {
				if (grid[r][c] == land) {
					nums++;
					bfs(grid, r, c);
				}
			}
		}
		return nums;
	}

	private void bfs(char[][] grid, int r, int c) {

		if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
			return;
		}

		if (grid[r][c] != land) {
			return;
		}

		grid[r][c] = visited;

		bfs(grid, r + 1, c);
		bfs(grid, r - 1, c);
		bfs(grid, r, c + 1);
		bfs(grid, r, c - 1);
	}

}
