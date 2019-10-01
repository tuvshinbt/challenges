package bt.pre.algo.stream;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamTest {

    /**
     * Intermediate tests
     */
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

    @Test
    public void testFilterAndDistinct() {
        IntStream stream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> actual = stream.filter(i -> i % 2 == 1)
                .distinct()
                .peek(System.out::println)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(1, 3);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterAndLimit() {
        IntStream stream = IntStream.generate(() -> new Random().nextInt(10));
        Long actual = stream.filter(new EvenNumber()).peek(System.out::println).limit(3).count();
        Long expected = 3L;
        assertEquals(expected, actual);
    }

    @Test
    public void testSkip() {
        IntStream stream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Long actual = stream.skip(3).count();
        Long expected = 7L;
        assertEquals(expected, actual);
    }

    @Test
    public void testMap() {
        Stream<String> stream = Stream.of("Java8", "Lamdbas", "Functional", "Programming");
        // Unboxing & Boxing
        List<Integer> actual = stream.mapToInt(i -> i.length()).boxed().collect(Collectors.toList());
        List<Integer> expected = Arrays.asList(5, 7, 10, 11);
        assertEquals(expected, actual);
    }

    @Test
    public void testFlatMap() {
        String[] words = new String[] { "Hello", "World" };
        List<String> actual = Arrays.stream(words)
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        // All
//        List<String> expected = Arrays.asList("H", "e", "l", "l", "o", "W", "o", "r", "l", "d");
        // Distinct
        List<String> expected = Arrays.asList("H", "e", "l", "o", "W", "r", "d");
        assertEquals(expected, actual);

    }

    // Matches
    @Test
    public void testAnyMatch() {
        IntStream stream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
        boolean actual = stream.anyMatch(i -> i > 4);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testAllMatch() {
        IntStream stream = Arrays.stream(new int[] { 2, 4, 6, 8 });
        boolean actual = stream.allMatch(new EvenNumber());
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testNoneMatch() {
        IntStream stream = Arrays.stream(new int[] { 1, 3, 5, 7 });
        boolean actual = stream.noneMatch(new EvenNumber());
        boolean expected = true;
        assertEquals(expected, actual);
    }

    // Find
    @Test
    public void testFindAny() {
        IntStream stream = Arrays.stream(new int[] { 1, 2, 3, 4 });
        OptionalInt actual = stream.filter(new EvenNumber()).findAny();
        int expected = 2;
        assertEquals(true, actual.isPresent());
        assertEquals(expected, actual.getAsInt());
    }

    @Test
    public void testFindFirst() {
        IntStream stream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
        OptionalInt actual = stream.map(i -> i * 3).findFirst();
        int expected = 3;
        assertEquals(true, actual.isPresent());
        assertEquals(expected, actual.getAsInt());
    }

    /**
     * Terminate operators tests
     */
    // Reduce
    @Test
    public void testReduceWithInitial() {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        int actual = stream.reduce(0, Integer::sum);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void testReduce() {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        OptionalInt actual = stream.reduce(Integer::sum);
        int expected = 15;
        assertTrue(actual.isPresent());
        assertEquals(expected, actual.getAsInt());
    }

    @Test
    public void testReduceFindMax() {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        int actual = stream.reduce(0, Integer::max);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testIterate() {
        int actual = Stream.iterate(0, i -> i + 2).limit(4).mapToInt(i -> i).sum();
        int expected = 12;
        assertEquals(expected, actual);
    }

    // collect
    @Test
    public void testMaxBy() {
        Comparator<Person> compareById = Comparator.comparingInt(Person::getId);
        Optional<Person> actual = Person.getPeople().stream().collect(maxBy(compareById));
        Person expected = Person.getJohnJames();
        assertNotNull(actual);
        assertEquals(expected, actual.get());
    }

    @Test
    public void testSummingInt() {
        int actual = Person.getPeople().stream().collect(summingInt(p -> p.getId()));
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageInt() {
        Double actual = Person.getPeople().stream().collect(averagingInt(p -> p.getFirstName().length()));
        Double expected = 4.0;
        assertEquals(expected, actual);
    }

    @Test
    public void testSummarizingInt() {
        IntSummaryStatistics actual = Person.getPeople().stream().collect(summarizingInt(p -> p.getId()));
        assertNotNull(actual);
        int expected = 6;
        assertEquals(expected, actual.getSum());
    }

    @Test
    public void testJoining() {
        String actual = Person.getPeople().parallelStream().map(p -> p.getLastName()).collect(joining());
        String expected = "BarGeorgeJames";
        assertEquals(expected, actual);
    }

    @Test
    public void testReducing() {
        int actual = Person.getPeople()
                .stream()
                .collect(reducing(0, (Person p) -> p.getFirstName().length(), (i, j) -> i + j));
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void testGroupingBy() {
        Map<Object, List<Person>> actual = Person.getPeople().stream().collect(groupingBy((p) -> p.getId() % 2 == 0));
        assertNotNull(actual);

        assertEquals(2, actual.size());
        assertEquals(new HashSet<Boolean>(Arrays.asList(true, false)), actual.keySet());

        // true
        assertEquals(1, actual.get(true).size());
        assertEquals(Arrays.asList(Person.getBryanGeorge()), actual.get(true));

        // false
        assertEquals(2, actual.get(false).size());
        assertEquals(Arrays.asList(Person.getFooBar(), Person.getJohnJames()), actual.get(false));
    }

    // Partitioning
    @Test
    public void testPartitioningBy() {
        Map<Boolean, List<Person>> actual = Person.getPeople()
                .parallelStream()
                .collect(partitioningBy(p -> p.getId() % 2 == 1));

        assertEquals(2, actual.size());
        assertEquals(new HashSet<Boolean>(Arrays.asList(true, false)), actual.keySet());

        // true
        assertEquals(2, actual.get(true).size());
        assertEquals(Arrays.asList(Person.getFooBar(), Person.getJohnJames()), actual.get(true));

        // false
        assertEquals(1, actual.get(false).size());
        assertEquals(Arrays.asList(Person.getBryanGeorge()), actual.get(false));
    }

}

class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static List<Person> getPeople() {
        return Arrays.asList(getFooBar(), getBryanGeorge(), getJohnJames());
    }

    public static Person getFooBar() {
        return new Person(1, "Foo", "Bar");
    }

    public static Person getBryanGeorge() {
        return new Person(2, "Bryan", "George");
    }

    public static Person getJohnJames() {
        return new Person(3, "John", "James");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + id;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!firstName.equals(other.firstName))
            return false;
        if (id != other.id)
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }
}
