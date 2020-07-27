package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _041_CountPrimesTest {

	private final _041_CountPrimes solution = new _041_CountPrimes();
	
	@Test
	public void example1() {
		int n = 10;
		
		int actual = solution.countPrimes(n);
		
		assertEquals(4, actual);
	}
	
}
