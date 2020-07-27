package bt.pre.algo.problems.top.easy;

public class _041_CountPrimes {
	public int countPrimes(int n) {
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}
		// Loop's ending condition is i * i < n instead of i < sqrt(n)
		// to avoid repeatedly calling an expensive function sqrt().
		for (int i = 2; i * i < n; i++) {
			if (!isPrime[i])
				continue;
			for (int j = i * i; j < n; j += i) {
				isPrime[j] = false;
			}
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime[i])
				count++;
		}
		return count;
	}

	public int countPrimesSolution(int n) {
		if (n < 3)
			return 0;
		boolean[] s = new boolean[n];
		int c = n / 2;
		for (int i = 3; i < Math.sqrt(n); i += 2) {
			if (s[i])
				continue;
			for (int j = i * i; j < n; j += 2 * i) {
				if (!s[j]) {
					c--;
					s[j] = true;
				}
			}
		}
		return c;
	}
}
