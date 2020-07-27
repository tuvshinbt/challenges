package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _045_HammingDistanceTest {

	private final _045_HammingDistance solution = new _045_HammingDistance();

	@Test
	public void example1() {
		int actual = solution.hammingDistance(1, 4);
		int expected = 2;
		assertEquals(expected, actual);
	}
}
