package missing__number;


public class Main {
    public static void main(String[] args) {

        int [] array = {0,1,2,3,4,5,6,7,9};
        int  n = missingNumber(array);
        System.out.println(n);

    }
        public static int missingNumber(int[] nums) {
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            for (int num : nums) {
                actualSum += num;
            }
            return expectedSum - actualSum;
        }

}
