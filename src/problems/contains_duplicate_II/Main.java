package contains_duplicate_II;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1,0,1,1};

        System.out.println(containsNearbyDuplicate(arr, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> myMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                Integer previousIndex = myMap.get(nums[i]);
                if (previousIndex != null && Math.abs(i - previousIndex) <= k) {
                    return true;
                }
                myMap.put(nums[i], i);
            }
            return false;
        }

}
