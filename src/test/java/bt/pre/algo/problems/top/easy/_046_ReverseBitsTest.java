package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _046_ReverseBitsTest {

	private _046_ReverseBits solution = new _046_ReverseBits();

	@Test
	public void example1() {
		int n = Integer.parseInt("00000010100101000001111010011100", 2);

		int out = solution.reverseBits(n);
		String expected = "111001011110000010100101000000";
		assertEquals(expected, Integer.toBinaryString(out));
	}
}
