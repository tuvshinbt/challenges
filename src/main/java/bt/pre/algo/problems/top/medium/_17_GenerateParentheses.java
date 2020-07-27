package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.List;

public class _17_GenerateParentheses {

	private String bp = "(";
	private String ep = ")";

	public List<String> generateParenthesis(int n) {

		List<String> result = new ArrayList<>();
		if (n == 0) {
			return result;
		}

		StringBuilder sb = new StringBuilder();
		build(n, n, sb, result);
		return result;
	}

	private void build(int bNum, int eNum, StringBuilder cur, List<String> result) {

		if (bNum == 0 && eNum == 0) {
			result.add(cur.toString());
			return;
		}

		if (bNum > 0) {
			cur.append(bp);
			build(bNum - 1, eNum, cur, result);
			cur.deleteCharAt(cur.length() - 1);

		}
		if (bNum != eNum && eNum > 0) {
			cur.append(ep);
			build(bNum, eNum - 1, cur, result);
			cur.deleteCharAt(cur.length() - 1);
		}
	}

	/*
	 * SOLUTION
	 */
	public List<String> solutionGenerateParenthesis(int n) {
		List<String> ans = new ArrayList();
		backtrack(ans, "", 0, 0, n);
		return ans;
	}

	public void backtrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			return;
		}

		if (open < max)
			backtrack(ans, cur + "(", open + 1, close, max);
		if (close < open)
			backtrack(ans, cur + ")", open, close + 1, max);
	}
}
