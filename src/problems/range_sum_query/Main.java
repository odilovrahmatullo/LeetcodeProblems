package range_sum_query;

public class Main {
    public static void main(String[] args) {
        int [] array = {-2, 0, 3, -5, 2, -1};
        int left = 0;
        int right = 5;

        NumArray(array);
        System.out.println(sumRange(left, right));

    }

         static int [] arr;
        public static void NumArray(int[] nums) {
            arr = new int[nums.length];
            arr[0] = nums[0];
            for(int i = 1; i< nums.length; i++){
                arr[i]= arr[i-1]+nums[i];
            }
        }

        public static int sumRange(int left, int right) {
            if(left==0){
                return arr[right];
            }
            return arr[right] - arr[left-1];
        }
    }
