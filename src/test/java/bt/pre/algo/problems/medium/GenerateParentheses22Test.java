package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenerateParentheses22Test {

    GenerateParentheses22 generateParentheses22 = new GenerateParentheses22();

    @Test
    public void example1Test() {
        List<String> expected = new ArrayList<String>();
        expected.add("()");
        List<String> actual = generateParentheses22.generateParenthesis(1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void example2Test() {
        List<String> expected = new ArrayList<String>();
        expected.add("(())");
        expected.add("()()");
        List<String> actual = generateParentheses22.generateParenthesis(2);
        assertEquals(expected, actual);
    }
}
