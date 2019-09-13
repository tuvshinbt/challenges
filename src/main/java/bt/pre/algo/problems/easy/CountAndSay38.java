package bt.pre.algo.problems.easy;

public class CountAndSay38 {
    public String countAndSay(int n) {

        if (n < 0 && n > 30) {
            return "";
        }

        String result = "", temp = "";
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                result += i;
            } else {
                char[] chars = result.toCharArray();
                char cur = chars[0];
                int count = 1;
                for (int j = 1; j < chars.length; j++) {
                    char c = chars[j];
                    if (c != cur) {
                        temp += "" + count + cur;
                        count = 1;
                        cur = c;
                    } else {
                        count++;
                    }
                }
                result = temp + count + cur;
                temp = "";
            }
        }
        return result;
    }
}
