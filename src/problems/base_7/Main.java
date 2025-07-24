package problems.base_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
        System.out.println(convertToBase7(-7));
    }

   /* public static String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean isNegative = num < 0;
        num = Math.abs(num);
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int rest = num % 7;
            result.append(rest + "");
            num /= 7;
        }

        if (isNegative) result.append("-");

        return result.reverse().toString();

    }*/

    //second solution is very simple
    public static String convertToBase7(int num) {
        return Integer.toString(num,7);
    }
}
