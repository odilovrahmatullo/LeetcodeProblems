package contiguous_array;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int [] nums = {0,1,0,1,0,0,1};

        System.out.println(findMaxLength(nums));

    }

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int summa = 0, result = 0;

        for (int i = 0; i < nums.length; i++) {
            summa += nums[i];
            if (myMap.containsKey(summa)) {
                result = Math.max(result,i-myMap.get(summa));
            } else {
                myMap.put(summa, i);
            }

        }

        return result;
    }
}
