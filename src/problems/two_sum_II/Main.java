package two_sum_II;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));


    }

    public static int[] twoSum(int[] numbers, int target) {

        int[] arr = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            if (numbers[left] + numbers[right] == target) {
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right = right - 1;
            } else {
                left = left + 1;
            }
        }

        arr[0] = left+1;
        arr[1] = right+1;
        return arr;
    }

}
