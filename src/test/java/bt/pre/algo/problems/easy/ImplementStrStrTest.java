package bt.pre.algo.problems.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ImplementStrStrTest {

    static ImplementStrStr implementStrStr;

    @BeforeAll
    static void setup() {
        implementStrStr = new ImplementStrStr();
    }

    @Test
    void hello_ll() {
        assertEquals(2, implementStrStr.strStr("hello", "ll"));
    }

    @Test
    void aaaa_baa() {
        assertEquals(-1, implementStrStr.strStr("aaaa", "baa"));
    }
}
