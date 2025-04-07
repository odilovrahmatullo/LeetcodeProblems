package closest_sum_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {3, 1, 9, -4, 2, -1};
        int target = 5;
        System.out.println((removeElement(array,target)));

    }

    public static int  removeElement(int [] nums, int target){
        Arrays.sort(nums);
        int resultSum = nums[0]+nums[1]+nums[2];
        int minDif = Integer.MAX_VALUE;
        for(int i =0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target)
                    return target;
                if(sum<target)
                    left++;
                else
                    right--;

                int toTarget = Math.abs(sum-target);
                if(toTarget<minDif){
                    resultSum = sum;
                    minDif = toTarget;
                }

            }
        }
        return resultSum;
    }



}