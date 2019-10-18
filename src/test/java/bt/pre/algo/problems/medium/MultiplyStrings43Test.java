package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplyStrings43Test {

    private MultiplyStrings43 multiplyStrings43 = new MultiplyStrings43();

    @Test
    public void example1Test() {
        assertEquals("6", this.multiplyStrings43.multiply("2", "3"));
    }

    @Test
    public void example2Test() {
        assertEquals("56088", this.multiplyStrings43.multiply("123", "456"));
    }

    @Test
    public void example3Test() {
        assertEquals("81", this.multiplyStrings43.multiply("9", "9"));
    }

    @Test
    public void example4Test() {
        assertEquals("0", this.multiplyStrings43.multiply("0", "9133"));
    }

    @Test
    public void example5Test() {
        assertEquals("121932631112635269", this.multiplyStrings43.multiply("123456789", "987654321"));
    }
}
