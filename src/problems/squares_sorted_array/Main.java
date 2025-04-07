package squares_sorted_array;

public class Main {
    public static void main(String[] args) {

        int [] nums = {-4,-1,0,3,10};
        System.out.println(sortedSquares(nums).toString());
    }

    public static int[] sortedSquares(int[] nums) {
        int [] newArray = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int index = right;
        while (left<=right){
        int leftSq = nums[left]*nums[left];
        int rightSq = nums[right]*nums[right];
        if(leftSq>rightSq){
            newArray[index] = leftSq;
            left++;
        }
        else{
            newArray[index] = rightSq;
            right--;
        }
        index--;
        }
        return newArray;
    }
}
