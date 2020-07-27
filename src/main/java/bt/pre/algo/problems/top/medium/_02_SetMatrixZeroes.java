package bt.pre.algo.problems.top.medium;

public class _02_SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		if (matrix == null)
			return;

		int m = matrix.length;
		int n = matrix[0].length;

		// Set zeros in the first row and column
		boolean hasZeroInFRow = false, hasZeroInFCol = false;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					if (i == 0)
						hasZeroInFRow = true;
					else if (j == 0)
						hasZeroInFCol = true;
					else {
						matrix[0][j] = 0;
						matrix[i][0] = 0;
					}
				}
			}
		}

		// Set zeros through columns
		for (int i = 1; i < m; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 1; j < n; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		// Set zeros through rows
		for (int j = 1; j < n; j++) {
			if (matrix[0][j] == 0) {
				for (int i = 1; i < m; i++) {
					matrix[i][j] = 0;
				}
			}
		}

		boolean hasZeroAtCorner = matrix[0][0] == 0;
		// Set zeros in the first row
		if (hasZeroInFCol || hasZeroAtCorner) {
			for (int i = 0; i < m; i++) {
				matrix[i][0] = 0;
			}
		}
		// Set zeros in the first column
		if (hasZeroInFRow || hasZeroAtCorner) {
			for (int j = 0; j < n; j++) {
				matrix[0][j] = 0;
			}
		}
	}
}
