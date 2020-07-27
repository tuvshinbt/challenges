package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _039_MinStackTest {
	private final _039_MinStack solution = new _039_MinStack();

	@Test
	public void exampl1() {
		solution.push(-2);
		solution.push(0);
		solution.push(-3);

		assertEquals(-3, solution.getMin());
		solution.pop();
		assertEquals(0, solution.top());
		assertEquals(-2, solution.getMin());
	}
}
