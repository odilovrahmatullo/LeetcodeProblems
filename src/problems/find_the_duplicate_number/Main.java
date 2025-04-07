package find_the_duplicate_number;


public class Main {
   /* public static void main(String[] args) {

        int [] array = {1,3,4,2,2};
        System.out.println(findDuplicate(array));

    }

    public static int findDuplicate(int [] nums){

        Set<Integer>mySet = new HashSet<>();
        for(int num : nums){
            if(!mySet.add(num)){
                return num;
            }
        }
        return 0;
    }*/ //1-example

    public static void main(String[] args) {

        int[] array = {1, 3, 4, 7, 2, 4, 5, 6};
        System.out.println(findDuplicate(array));

    }

    public static int findDuplicate(int[] nums) {
            int slow = 0;
            int fast = 0;
            if(nums[0]==nums[1]){
                return nums[0];
            }
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            while (slow != fast);
            fast = 0;
            while (fast != slow) {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
    }
