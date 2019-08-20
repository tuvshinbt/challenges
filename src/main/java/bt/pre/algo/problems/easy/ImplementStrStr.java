package bt.pre.algo.problems.easy;

public class ImplementStrStr {
    public static void main(String[] args) {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        String haystack = "aaaa";
        String needle = "bba";

        System.out.printf("result %d\n", implementStrStr.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

}
