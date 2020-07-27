package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class _18_PermutationsTest {
	private final _18_Permutations solution = new _18_Permutations();

	@Test
	public void example1() {
		int[] nums = new int[] { 1, 2, 3 };

		List<List<Integer>> actual = solution.permute(nums);
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(1, 2, 3),
				Arrays.asList(1, 3, 2),
				Arrays.asList(2, 1, 3),
				Arrays.asList(2, 3, 1),
				Arrays.asList(3, 1, 2),
				Arrays.asList(3, 2, 1));

		assertEquals(expected, actual);
	}
}
