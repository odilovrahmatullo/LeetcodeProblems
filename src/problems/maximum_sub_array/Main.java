package maximum_sub_array;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int result = sum;

        int startIndex = 0;
        int endIndex = k;
        while (endIndex < nums.length) {
            sum -= nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;
            if (sum > result) {
                result = sum;
            }
        }
        return result/k;
    }
}
