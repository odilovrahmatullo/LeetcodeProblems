package two_sum;

public class Main {
    public static void main(String[] args) {
      Integer [] nums = {2,7,11,15};
       int target = 9;
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if(nums[i]==nums[j]) {
                    if (nums[i] == target)
                        return new int[]{i, j};
                }
            }

        }


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};

                }

            }
        }

        return new int[]{-1};


    }
}
