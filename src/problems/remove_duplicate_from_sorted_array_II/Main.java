package remove_duplicate_from_sorted_array_II;

public class Main {
    public static void main(String[] args) {

    int [] array = {0,0,0,1,1,1,2,2,2,3,3,3};
        System.out.println(removeDuplicates(array));
        //{0,0,1,1,2,2,3,3 = 8

    }


    public static int removeDuplicates(int[] nums) {
        int k =0;
        for(int n : nums){
            if(k<2 || n!=nums[k-2]){
                nums[k++] = n;
            }
        }
        return k;
    }
}
