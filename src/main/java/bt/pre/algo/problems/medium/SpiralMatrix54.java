package bt.pre.algo.problems.medium;

import java.util.*;

/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 */
public class SpiralMatrix54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        this.traverseAsSpiral(matrix, result, matrix.length, matrix[0].length, -1, -1);
        return result;
    }

    private void traverseAsSpiral(int[][] matrix, List<Integer> result, int eR, int eC, int sR, int sC) {

        if (eR - 1 <= sR || eC - 1 <= sR) {
            return;
        }

        // go the right
        for (int i = sC + 1; i < eC; i++) {
            result.add(matrix[sR + 1][i]);
        }
        boolean wentDown = false;
        // go the down
        for (int i = sR + 2; i < eR; i++) {
            result.add(matrix[i][eC - 1]);
            wentDown = true;
        }
        boolean wentLeft = false;
        if (wentDown) {
            // go the left
            for (int i = eC - 2; i > sC; i--) {
                result.add(matrix[eR - 1][i]);
                wentLeft = true;
            }
        }
        if (wentLeft) {
            // go the top
            for (int i = eR - 2; i > sR + 1; i--) {
                result.add(matrix[i][sC + 1]);
            }
        }
        traverseAsSpiral(matrix, result, eR - 1, eC - 1, sR + 1, sC + 1);
    }
}
