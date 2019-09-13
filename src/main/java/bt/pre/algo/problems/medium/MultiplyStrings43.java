package bt.pre.algo.problems.medium;

import java.util.Arrays;

public class MultiplyStrings43 {
    public String multiply(String num1, String num2) {

        if (num1 == null || num1.length() == 0 || "0".equals(num1) || num2 == null || num2.length() == 0
                || "0".equals(num2)) {
            return "0";
        }

        int[][] sum = new int[num1.length()][5];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {

                int g = (num1.length() - 1 - i) + (num2.length() - 1 - j);
                int multiplicand = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                sum[i][g] += multiplicand % 10;
                if (multiplicand / 10 > 0) {
                    sum[i][g + 1] += multiplicand / 10;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 5; i++) {
            int s = 0;
            for (int j = 0; j < num1.length(); j++) {
                s += sum[j][i];
            }
            int multiplier = 1;
            for (int c = 0; c < i; c++) {
                multiplier *= 10;
            }
            result += multiplier * s;
            s = 0;
        }
        return result + "";
    }
}
