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
}
