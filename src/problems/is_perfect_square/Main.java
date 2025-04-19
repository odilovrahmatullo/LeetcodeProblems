package problems.is_perfect_square;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(20));
    }

    public static boolean isPerfectSquare(int num) {
        long low = 0;
        long high = num;
        long result = 0;
        while (low <= high) {
            long mid = (high + low) / 2;
            long sq = mid * mid;
            if (sq == num) return true;
            else if (sq < num) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
}
