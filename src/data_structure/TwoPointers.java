package data_structure;

import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {

        int [] nums = {1,3,5,7,9,11};
        int target = 14;

        System.out.println(Arrays.toString(twoIndex(nums,target)));
    }


    public static int[] twoIndex(int [] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int arr[]=new int[2];
        while (left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                break;
            }
            else if(sum<target){
                left++;
            }
            else {
                right--;
            }
        }
        arr[0]=left+1;
        arr[1]=right+1;

        return arr;

    }
}
