package bt.pre.algo.problems.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku36 {

    public boolean isValidSudoku(char[][] board) {
        if (board != null && board.length != 9 && board[0].length != 9) {
            return false;
        }
        List<Set<Character>> colSets = new ArrayList<Set<Character>>();
        List<Set<Character>> boxSets = new ArrayList<Set<Character>>();
        for (int i = 0; i < 9; i++) {
            colSets.add(new HashSet<Character>());
            boxSets.add(new HashSet<Character>());
        }
        boolean result = true;
        for (int r = 0; r < board.length; r++) {
            Set<Character> rowSet = new HashSet<Character>();
            for (int c = 0; c < board[0].length; c++) {
                char elem = board[r][c];
                if (elem == '.')
                    continue;
                // Row
                if (!rowSet.add(elem)) {
                    return false;
                }
                // Column
                if (!colSets.get(c).add(elem)) {
                    return false;
                }
                // Box
                int boxIndex = (r / 3) * 3 + c / 3;
                if (!boxSets.get(boxIndex).add(elem)) {
                    return false;
                }
            }
        }
        return result;
    }
}
