package bt.pre.algo.problems.easy;

public class LengthLastWord58 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int i = s.length() - 1, l = 0;
        while (i > -1 && s.charAt(i) == ' ') {
            i--;
        }
        while (i > -1 && s.charAt(i) != ' ') {
            l++;
            i--;
        }
        return l;
    }
}
