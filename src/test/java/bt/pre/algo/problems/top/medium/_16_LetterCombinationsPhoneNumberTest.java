package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class _16_LetterCombinationsPhoneNumberTest {

	private final _16_LetterCombinationsPhoneNumber solution = new _16_LetterCombinationsPhoneNumber();

	@Test
	public void example1() {
		String digits = "23";

		List<String> actual = solution.letterCombinations(digits);
		List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

		assertEquals(expected, actual);
	}
}
