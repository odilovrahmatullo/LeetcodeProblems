package find_all_numbers_disappeared_array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public  static List<Integer> findDisappearedNumbers(int[] nums) {
        int [] array = new int[nums.length+1];
        for(int i : nums){
            array[i] =1;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<array.length; i++){
            if(array[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}
