package contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

        int [] array = {3,3};
        System.out.println(containsDuplicate(array));

    }


    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int num : nums){
            if(!mySet.add(num))
                return true;
        }
        return false;
    }
}
