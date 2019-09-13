package bt.pre.algo.problems.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountAndSay38Test {

    CountAndSay38 countAndSay38 = new CountAndSay38();
    
    @Test
    public void example1Test() {
        assertEquals("1", countAndSay38.countAndSay(1));
    }
    @Test
    public void example2Test() {
        assertEquals("1211", countAndSay38.countAndSay(4));
    }
    @Test
    public void example3Test() {
        assertEquals("111221", countAndSay38.countAndSay(5));
    }
    
}
