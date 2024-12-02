import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<=right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                break;
            }
            if(sum>target){
                right--;
            }
            else
                left++;
        }

        return new int[]{left+1,right+1};
    }
}
