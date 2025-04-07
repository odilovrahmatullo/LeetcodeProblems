package count_pairs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(6);
        test.add(2);
        test.add(5);
        test.add(-2);
        test.add(-7);
        test.add(-1);
        test.add(3);
        System.out.println(countPairs(test, -2));
    }


    public static int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int[] arr = new int[n];
        int i = 0;
        int count = 0;
        for (int number : nums) {
            arr[i++] = number;
        }

        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
