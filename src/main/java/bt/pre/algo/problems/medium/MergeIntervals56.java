package bt.pre.algo.problems.medium;

import java.util.*;

public class MergeIntervals56 {
    public int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return new int[][] {};
        }

        Arrays.sort(intervals, (

                int[] o1, int[] o2) -> {
            return Integer.compare(o1[0], o2[0]);
        });

        List<int[]> result = new ArrayList<>();
        int s = intervals[0][0], e = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= e) {
                if (intervals[i][1] >= e)
                    e = intervals[i][1];
            }
            else {
                result.add(new int[] { s, e });
                s = intervals[i][0];
                e = intervals[i][1];
            }
        }
        result.add(new int[] { s, e });

        return result.stream().toArray(int[][]::new);

    }

}
