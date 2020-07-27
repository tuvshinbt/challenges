package bt.pre.algo.problems.top.easy;

public class _019_CountSay {
	public String countAndSay(int n) {

		if (n < 0 || n > 30) {
			return "";
		}

		if (n == 1) {
			return "1";
		}

		String result = countAndSay(n - 1);
		char pc = result.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < result.length(); i++) {
			if (pc != result.charAt(i)) {
				sb.append(count);
				sb.append(pc);
				count = 1;
				pc = result.charAt(i);
			} else {
				count++;
			}
		}
		sb.append(count);
		sb.append(pc);
		return sb.toString();
	}

}
