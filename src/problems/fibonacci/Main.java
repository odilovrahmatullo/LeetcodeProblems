package problems.fibonacci;

public class Main {

    public static void main(String[] args) {
        System.out.print(fib(0) + " ");
        System.out.print(fib(1) + " ");
        System.out.print(fib(2) + " ");
        System.out.print(fib(3) + " ");
        System.out.print(fib(4) + " ");
        System.out.print(fib(5) + " ");
        System.out.print(fib(6) + " ");
        System.out.print(fib(7) + " ");
    }


    public static int fib(int n) {
        if(n==0) return 0;
        int f0 = 0;
        int f1 = 1;
        int temp = f1;
        for (int i = 2; i <= n; i++) {
            f1 = f0 + f1;
            f0 = temp;
            temp = f1;
        }

        return f1;
    }
}
