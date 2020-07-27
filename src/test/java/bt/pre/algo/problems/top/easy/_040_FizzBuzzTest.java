package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class _040_FizzBuzzTest {

	private final _040_FizzBuzz solution = new _040_FizzBuzz();

	@Test
	public void example1() {
		int n = 15;
		List<String> actual = solution.fizzBuzz(n);
		List<String> expected = Arrays.asList(
				"1",
				"2",
				"Fizz",
				"4",
				"Buzz",
				"Fizz",
				"7",
				"8",
				"Fizz",
				"Buzz",
				"11",
				"Fizz",
				"13",
				"14",
				"FizzBuzz");

		assertEquals(expected, actual);
	}
}
