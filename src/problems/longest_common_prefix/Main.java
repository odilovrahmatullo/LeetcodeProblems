package longest_common_prefix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arr = {""};
        System.out.println(longestCommonPrefix(arr));

    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = "";
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            result += first.charAt(i);
            i++;
        }

        return result;
    }
}
