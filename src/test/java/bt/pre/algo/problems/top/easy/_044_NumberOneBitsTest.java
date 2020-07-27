package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _044_NumberOneBitsTest {

	private final _044_NumberOneBits solution = new _044_NumberOneBits();

	@Test
	public void example1() {
		int n = Integer.parseInt("00000000000000000000000000001011", 2);

		int actual = solution.hammingWeight(n);
		int expected = 3;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		int n = Integer.parseInt("00000000000000000000000010000000", 2);

		int actual = solution.hammingWeight(n);
		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void example3() {
		int n = Integer.parseInt("11111111111111111111111111111101", 2);

		int actual = solution.hammingWeight(n);
		int expected = 31;

		assertEquals(expected, actual);
	}
}
