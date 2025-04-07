package majority_element;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] array = {3,2,3};
        System.out.println(majorityElement(array));

    }


    public static int majorityElement(int [] nums){
        Arrays.sort(nums);
        int result = nums[0], count = 1;
        for (int i = 1; i<nums.length; i++){
            if(count==0){
                result = nums[i];
            }
            if(nums[i]==result){
                count++;
            }
            else
                count--;
        }
        return result;
    }
}
