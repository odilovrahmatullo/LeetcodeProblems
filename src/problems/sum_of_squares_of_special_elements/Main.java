package problems.sum_of_squares_of_special_elements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(sumOfSquares(nums));
    }

    public static int sumOfSquares(int[] nums) {
        int size = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (size % (i + 1) == 0) sum += nums[i] * nums[i];
        }

        return sum;

    }


}
