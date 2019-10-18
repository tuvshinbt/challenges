package bt.pre.algo.problems.medium;

public class RotateImage48 {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int r = i, lr = matrix.length - 1 - r;
            for (int c = r; c < lr; c++) {
                swapCorners(matrix, lr, r, c);
            }
        }
    }

    private void swapCorners(int[][] matrix, int lr, int r, int c) {
        int tmp = matrix[r][c];
        matrix[r][c] = matrix[lr - (c - r)][r];
        matrix[lr - (c - r)][r] = matrix[lr][lr - (c - r)];
        matrix[lr][lr - (c - r)] = matrix[c][lr];
        matrix[c][lr] = tmp;
    }
}
