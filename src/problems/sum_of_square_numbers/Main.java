package problems.sum_of_square_numbers;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("74 = " + judgeSquareSum(74));
        System.out.println("4 = " + judgeSquareSum(4));
        System.out.println("5 = " + judgeSquareSum(5));
        System.out.println("37 = " + judgeSquareSum(37));*/
        // System.out.println("2147483600 = " + getAbsoluteNumber(2147483600));
        System.out.println("2147483600 = " + judgeSquareSum(2147483600));
        /*        System.out.println("3 = " + judgeSquareSum(3));*/


    }

    public static boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (right >= left) {
            long sqSum = 1L * right * right + 1L * left * left;
            if (sqSum == c) return true;
            else if (sqSum > c) right--;
            else left++;
        }
        return false;
    }


/*    private static int getAbsoluteNumber(int c) {
        int low = 0;
        int high = c;
        int result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            long square = 1L* mid * mid;
            if (square == c) {
                result = mid;
                break;
            } else if (square < c) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }*/
}
