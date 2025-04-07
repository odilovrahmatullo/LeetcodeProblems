package find_firtth_occurence_in_string;

public class Main {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
    }

    public static int strStr(String haystack, String needle) {
        int n = needle.length();//ll = 2
        int m = haystack.length();//hello = 5

        if (n > m)
            return -1;

        for (int i = 0; i <= m - n; i++) {
            String checker = haystack.substring(i, i + n);
            if (checker.equals(needle))
                return i;
        }

        return -1;


    }
}
