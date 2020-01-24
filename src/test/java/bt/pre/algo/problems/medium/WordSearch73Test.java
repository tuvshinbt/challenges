package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WordSearch73Test {

    private final WordSearch73 wordSearch73 = new WordSearch73();

    @Test
    void testExample1() {
        char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        assertEquals(true, this.wordSearch73.exist(board, word));
    }

    @Test
    void testExample2() {
        char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "SEE";
        assertEquals(true, this.wordSearch73.exist(board, word));
    }

    @Test
    void testExample3() {
        char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCB";
        assertEquals(false, this.wordSearch73.exist(board, word));
    }
}
