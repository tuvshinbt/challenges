package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class _19_SubsetsTest {

	private final _19_Subsets solution = new _19_Subsets();

	@Test
	public void example1() {
		int[] nums = new int[] { 1, 2, 3 };

		List<List<Integer>> actual = solution.subsets(nums);
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(3),
				Arrays.asList(1),
				Arrays.asList(2),
				Arrays.asList(1, 2, 3),
				Arrays.asList(1, 3),
				Arrays.asList(2, 3),
				Arrays.asList(1, 2),
				Arrays.asList());
		assertEquals(expected.size(), actual.size());
	}
}
