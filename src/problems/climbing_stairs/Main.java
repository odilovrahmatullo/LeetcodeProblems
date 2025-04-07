package climbing_stairs;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n){
        int summa = 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            summa = first + second;
            first = second;
            second = summa;
        }
        return summa;
    }


}
