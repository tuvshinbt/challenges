package bt.pre.algo.problems.top.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _010_ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		if (board == null || board.length != 9 || board[0].length != 9)
			return false;

		List<Set<Character>> rowChars = new ArrayList<Set<Character>>();
		initializeSets(rowChars);
		List<Set<Character>> colChars = new ArrayList<Set<Character>>();
		initializeSets(colChars);
		List<Set<Character>> boxChars = new ArrayList<Set<Character>>();
		initializeSets(boxChars);

		for (int r = 0; r < 9; r++) {
			for (int c = 0; c < 9; c++) {
				int rN = r / 3;
				int cN = c / 3;

				char e = board[r][c];
				if (e != '.') {
					if (!rowChars.get(r).add(e) || !colChars.get(c).add(e) || !boxChars.get(rN * 3 + cN).add(e)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	private void initializeSets(List<Set<Character>> list) {
		for (int i = 0; i < 9; i++) {
			list.add(new HashSet<Character>());
		}
	}
}
