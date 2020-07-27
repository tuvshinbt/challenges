package bt.pre.algo.problems.top.easy;

public class _017_StringToInteger {
	public int myAtoi(String str) {
		int result = 0;
		if (str == null || str.replace(" ", "").isEmpty())
			return result;

		char space = ' ';
		int sign = 1;
		boolean isStarted = false;
		for (char c : str.toCharArray()) {
			if (!isStarted && c == space)
				continue;

			if (!isStarted && (c == '+' || c == '-')) {
				isStarted = true;
				if (c == '-')
					sign = -1;
			} else if (c >= '0' && c <= '9') {
				isStarted = true;
				if (result > Integer.MAX_VALUE / 10
						|| (result == Integer.MAX_VALUE / 10 && c > '7')) {
					if (sign > 0) {
						return Integer.MAX_VALUE;
					} else {
						return Integer.MIN_VALUE;
					}
				}
				result = result * 10 + (c - '0');
			} else {
				if (isStarted) {
					break;
				} else {
					return result;
				}
			}
		}
		return result * sign;
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE * 10);
	}
}
