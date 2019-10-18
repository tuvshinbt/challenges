package bt.pre.algo.problems.medium;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Given two non-negative integers num1 and num2 represented as strings, 
 * return the product of num1 and num2, also represented as a string.

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 */
public class MultiplyStrings43 {
    public String multiply(String num1, String num2) {
        if (num1 == null || "".equals(num1) || num1.length() >= 110 || num2 == null || "".equals(num2)
                || num2.length() >= 110)
            return "";

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        if (num2.length() > num1.length()) {
            String tmp = num2;
            num2 = num1;
            num1 = tmp;
        }

        List<Integer> rl1 = num1.chars().map(i -> i - '0').boxed().collect(Collectors.toList());
        Collections.reverse(rl1);
        List<Integer> rl2 = num2.chars().map(i -> i - '0').boxed().collect(Collectors.toList());
        Collections.reverse(rl2);

        List<List<Integer>> sl = new ArrayList<>();
        for (int i = 0; i < rl2.size(); i++) {
            List<Integer> pl = new ArrayList<>();
            int m = 0;

            // fill with 0
            for (int k = 0; k < i; k++) {
                pl.add(0);
            }

            for (int j = 0; j < rl1.size(); j++) {
                int p = rl2.get(i) * rl1.get(j) + m;
                pl.add(p % 10);
                m = p / 10;
            }
            if (m > 0) {
                pl.add(m);
            }
            sl.add(pl);
        }

        Map<Integer, Integer> sm = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        int m = 0;
        for (List<Integer> l : sl) {
            m = 0;
            for (int i = 0; i < l.size(); i++) {
                int c = 0;
                if (sm.containsKey(i)) {
                    c = sm.get(i);
                }
                int cp = l.get(i) + c + m;
                sm.put(i, cp % 10);
                m = cp / 10;
            }
            if (m > 0) {
                sm.put(l.size(), m);
            }
        }
        return sm.entrySet().stream().map(i -> String.valueOf(i.getValue())).collect(Collectors.joining(""));
    }
}
