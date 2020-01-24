package bt.pre.algo.problems.medium;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, where
 * "adjacent" cells are those horizontally or vertically neighboring. The same
 * letter cell may not be used more than once.
 * 
 *
 */
public class WordSearch73 {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        if (word == null) {
            return true;
        }

        boolean exist = false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                exist = this.findChar(board, r, c, word, 0, visited);
                if (exist) {
                    break;
                }
            }
            if (exist) {
                break;
            }
        }
        return exist;
    }

    public boolean findChar(char[][] board, int r, int c, String word, int i, boolean[][] visited) {
        if (word.length() == i) {
            return true;
        }
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) {
            return false;
        }
        if (!visited[r][c] && board[r][c] == word.charAt(i)) {
            boolean result = false;
            visited[r][c] = true;
            result = findChar(board, r - 1, c, word, i + 1, visited);
            if (!result)
                result = findChar(board, r, c + 1, word, i + 1, visited);
            if (!result)
                result = findChar(board, r + 1, c, word, i + 1, visited);
            if (!result)
                result = findChar(board, r, c - 1, word, i + 1, visited);
            visited[r][c] = false;
            return result;
        }
        else {
            return false;
        }
    }
}
