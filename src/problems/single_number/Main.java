package single_number;

public class Main {
    public static void main(String[] args) {

       int [] nums = {2,2,1,4,1,9,3,11,9,3,4};
        System.out.println(singleNumber(nums));


    }

    public static int singleNumber(int[] nums){

        int result = nums[0];
        for(int i=1; i<nums.length; i++){

            result = result ^ nums[i];

        }

        return result;
    }
}
