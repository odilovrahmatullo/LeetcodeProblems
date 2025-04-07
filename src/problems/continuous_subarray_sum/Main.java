package continuous_subarray_sum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] nums = {23,2,6,4,7};

        System.out.println(checkSubarraySum(nums, 13));

    }

    public static boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int r = 0, prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];
            r = prefixSum % k;
            if (map.containsKey(r)) {
                if (i - map.get(r) > 1) {
                    return true;
                }
            } else {
                map.put(r, i);
            }

        }

        return false;
    }
}
