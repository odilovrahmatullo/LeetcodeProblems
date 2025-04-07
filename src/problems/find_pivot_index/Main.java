package find_pivot_index;

public class Main {
    public static void main(String[] args) {

        int [] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
   /*     int[] arr = new int[ nums.length + 1];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + nums[i - 1];
        }
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum = arr[ nums.length] - arr[i + 1];
            leftSum = arr[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;*/
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
