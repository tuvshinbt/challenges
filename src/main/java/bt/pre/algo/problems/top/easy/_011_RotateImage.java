package bt.pre.algo.problems.top.easy;

public class _011_RotateImage {
	public void rotate(int[][] matrix) {

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0 || matrix.length != matrix[0].length)
			return;

		for (int lvl = 0; lvl < matrix.length / 2; lvl++) {
			for (int ic = 0 + lvl; ic < matrix.length - (lvl + 1); ic++) {
				int r = lvl, c = ic;
				int len = matrix.length - 1;

				int n1r = c;
				int n1c = len - r;

				int n2r = n1c;
				int n2c = len - ic;

				int n3r = n2c;
				int n3c = len - n2r;

				int tmp = matrix[r][c];
				matrix[r][c] = matrix[n3r][n3c];
				matrix[n3r][n3c] = matrix[n2r][n2c];
				matrix[n2r][n2c] = matrix[n1r][n1c];
				matrix[n1r][n1c] = tmp;
			}
		}
	}
}
