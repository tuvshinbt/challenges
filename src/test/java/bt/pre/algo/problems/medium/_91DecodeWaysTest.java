package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _91DecodeWaysTest {

    private _91DecodeWays _91DecodeWays = new _91DecodeWays();

    @Test
    void example1Test() {
        String input = "12";
        int expected = 2;
        assertEquals(expected, this._91DecodeWays.numDecodings(input));
    }

    @Test
    void example2Test() {
        String input = "226";
        int expected = 3;
        assertEquals(expected, this._91DecodeWays.numDecodings(input));
    }

    @Test
    void example3Test() {
        String input = "1";
        int expected = 1;
        assertEquals(expected, this._91DecodeWays.numDecodings(input));
    }

    @Test
    void example4Test() {
        String input = "27";
        int expected = 1;
        assertEquals(expected, this._91DecodeWays.numDecodings(input));
    }

    @Test
    void example5Test() {
        String input = "227";
        int expected = 2;
        assertEquals(expected, this._91DecodeWays.numDecodings(input));
    }

    @Test
    void example6Test() {
        String input = "0";
        int expected = 0;
        assertEquals(expected, this._91DecodeWays.numDecodings(input));
    }

    @Test
    void example7Test() {
        String input = "00";
        int expected = 0;
        assertEquals(expected, this._91DecodeWays.numDecodings(input));
    }

    @Test
    void example8Test() {
        String input = "01";
        int expected = 0;
        assertEquals(expected, this._91DecodeWays.numDecodings(input));
    }
}
