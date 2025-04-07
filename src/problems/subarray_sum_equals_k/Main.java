package subarray_sum_equals_k;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      int [] arr = {-1,1,0};
      int k = 0;
        System.out.println(subarraySum(arr, k));

    }

    public static int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> myMap = new HashMap<>();
            myMap.put(0,1);
            int count = 0,sum = 0;
            for(int i= 0; i<nums.length; i++){
                sum+=nums[i];
                int diff = sum - k;
                if(myMap.containsKey(diff)){
                    count+=myMap.get(diff);
                }
                if(myMap.containsKey(sum)){
                    myMap.put(sum,myMap.get(sum)+1);
                }
                else
                    myMap.put(sum,1);
            }
        return count;
    }
}
