package bt.pre.algo.problems.medium;

/**
 * Share A message containing letters from A-Z is being encoded to numbers using
 * the following mapping:
 * 
 * 'A' -> 1 'B' -> 2 ... 'Z' -> 26 <br/>
 * Given a non-empty string containing only digits, determine the total number
 * of ways to decode it.
 * 
 *
 */
public class _91DecodeWays {
    public int numDecodings(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }

        int r = 0;
        return this.splitString(s, 0, 1, r);
    }

    private int splitString(String str, int i, int l, int r) {
        if (str.length() < i + l) {
//            System.out.println("");
            r = r + 1;
            return r;
        }
//        System.out.print(str.substring(i, i + 1) + " ");
        if (str.charAt(i) != '0') {
            r = this.splitString(str, i + 1, 1, r);
        }

        if (str.length() >= i + 2) {
            int c = Integer.parseInt(str.substring(i, i + 2));
            if (str.charAt(i) != '0' && c < 27 && c > 0) {
//              System.out.print(str.substring(i, i + 2) + " ");
                r = this.splitString(str, i + 2, 1, r);
            }
        }
        return r;
    }
}
