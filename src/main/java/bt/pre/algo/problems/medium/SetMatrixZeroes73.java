package bt.pre.algo.problems.medium;

import java.util.*;

public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rs = new HashSet<>();
        Set<Integer> cs = new HashSet<>();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    rs.add(r);
                    cs.add(c);
                }
            }
        }
        for (Integer r : rs) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = 0;
            }
        }
        for (Integer c : cs) {
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][c] = 0;
            }
        }
    }
}
