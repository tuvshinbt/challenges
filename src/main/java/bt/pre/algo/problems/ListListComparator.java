package bt.pre.algo.problems;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

    @Override
    public int compare(List<T> o1, List<T> o2) {
        Collections.sort((List<T>) o1);
        Collections.sort((List<T>) o2);
        String stro1 = o1.toString();
        String stro2 = o2.toString();
        return stro1.compareTo(stro2);
    }

}
