package bt.pre.algo.problems.top.medium;

public class _20_WordSearch {
	private boolean[][] visited;

	public boolean exist(char[][] board, String word) {

		if (board.length == 0 || word == null || word.isEmpty()) {
			return false;
		}

		int boardLength = board.length;
		int board_0_Length = board[0].length;
		visited = new boolean[board.length][board[0].length];
		for (int i = 0; i < boardLength; i++) {
			for (int j = 0; j < board_0_Length; j++) {
				if (board[i][j] == word.charAt(0)) {
					// found
					boolean found = dfs(board, i, j, word, 0);
					if (found) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean dfs(char[][] board, int r, int c, String word, int idx) {

		if (idx == word.length() - 1) {
			return word.charAt(idx) == board[r][c];
		} else {
			if (word.charAt(idx) == board[r][c]) {
				visited[r][c] = true;
				boolean found = false;
				if ((r - 1 > -1) && !visited[r - 1][c]) {
					found = dfs(board, r - 1, c, word, idx + 1);
				}
				if (!found && (c + 1 < board[0].length) && !visited[r][c + 1]) {
					found = dfs(board, r, c + 1, word, idx + 1);
				}
				if (!found && (r + 1 < board.length) && !visited[r + 1][c]) {
					found = dfs(board, r + 1, c, word, idx + 1);
				}
				if (!found && (c - 1 > -1) && !visited[r][c - 1]) {
					found = dfs(board, r, c - 1, word, idx + 1);
				}
				visited[r][c] = false;
				return found;
			} else {
				return false;
			}
		}
	}
}
