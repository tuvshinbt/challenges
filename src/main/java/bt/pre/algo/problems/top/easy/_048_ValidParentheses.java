package bt.pre.algo.problems.top.easy;

import java.util.Stack;

public class _048_ValidParentheses {
	public boolean isValid(String s) {

		if (s == null || s.isEmpty())
			return true;

		Stack<Character> stack = new Stack<Character>();
		char[] schars = s.toCharArray();
		for (char c : schars) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;
				char l = (char) stack.pop();
				switch (c) {
				case ')':
					if (l != '(')
						return false;
					break;
				case ']':
					if (l != '[')
						return false;
					break;
				case '}':
					if (l != '{')
						return false;
					break;
				default:
					break;
				}
			}
		}
		return stack.isEmpty();
	}
}
