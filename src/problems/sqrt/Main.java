package sqrt;

public class Main {

    /*Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
    The returned integer should be non-negative as well.

    You must not use any built-in exponent function or operator.
    For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

    Example 1:
    Input: x = 4
    Output: 2
    Explanation: The square root of 4 is 2, so we return 2.

    Example 2:
    Input: x = 8
    Output: 2
    Explanation: The square root of 8 is 2.82842..,since we round it down to the nearest integer, 2 is returned.*/
    public static void main(String[] args) {
        System.out.println("sqrt(8) = " + mySqrt(8));
        System.out.println("sqrt(10) = " + mySqrt(10));
        System.out.println("sqrt(100) = " + mySqrt(100));
        System.out.println("sqrt(121) = " + mySqrt(121));
        System.out.println("sqrt(120) = " + mySqrt(120));
        System.out.println("sqrt(122) = " + mySqrt(122));
    }

    public static int mySqrt(int x) {
        long start = 0;
        long end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (end * end == x) {
            return (int) end;
        }

        return (int) start;
    }
}
