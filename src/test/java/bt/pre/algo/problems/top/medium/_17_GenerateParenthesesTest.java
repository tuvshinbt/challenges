package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class _17_GenerateParenthesesTest {

	private final _17_GenerateParentheses solution = new _17_GenerateParentheses();

	@Test
	public void example1() {
		int n = 3;

		List<String> actual = solution.generateParenthesis(n);
		List<String> expected = Arrays.asList(
				"((()))",
				"(()())",
				"(())()",
				"()(())",
				"()()()");
		
		assertEquals(expected, actual);
	}
}
