package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class _03_GroupAnagramsTest {

	private final _03_GroupAnagrams solution = new _03_GroupAnagrams();

	@Test
	public void example1() {
		String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };

		List<List<String>> actual = solution.groupAnagrams(strs);

		List<List<String>> expected = Arrays.asList(
				Arrays.asList("ate", "eat", "tea"),
				Arrays.asList("bat"),
				Arrays.asList("nat", "tan"));

		assertNotNull(actual);
		assertEquals(expected.size(), actual.size());
		assertEquals(expected.get(0).size(), actual.get(0).size());
		assertEquals(expected.get(1).size(), actual.get(1).size());
		assertEquals(expected.get(2).size(), actual.get(2).size());
	}

}
