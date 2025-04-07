package integer_to_roman;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
     String str =  intToRoman(3749);
        System.out.println(str);

    }


    public static String intToRoman(int num) {
        int[] integer = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder str = new StringBuilder();
        for(int i = integer.length-1; i>=0 && num>0;i--){
            while (num >= integer[i]) {
                num = num - integer[i];
                str = str.append(roman[i]);
            }

        }
        return str.toString();
    }
}
