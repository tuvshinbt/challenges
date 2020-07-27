package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _014_FirstUniqueCharacterTest {

	private final _014_FirstUniqueCharacter solution = new _014_FirstUniqueCharacter();

	@Test
	public void testExample1() {
		String s = "leetcode";

		int actual = solution.firstUniqChar(s);

		assertEquals(0, actual);
	}

	@Test
	public void testExample2() {
		String s = "loveleetcode";

		int actual = solution.firstUniqChar(s);

		assertEquals(2, actual);
	}
}
