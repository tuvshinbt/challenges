package bt.pre.algo.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class StreamTest {

    @Test
    public void testFilter() {
        IntStream stream = IntStream.range(0, 10);
        List<Integer> actual = stream.filter(new EvenNumber())
                .peek(System.out::println)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(0, 2, 4, 6, 8);
        assertEquals(expected, actual);
    }

    public class EvenNumber implements IntPredicate {

        @Override
        public boolean test(int t) {
            return t % 2 == 0;
        }

    }
}
