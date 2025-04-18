package problems.two_factors;

public class Main {
    public static void main(String[] args) {
        System.out.println(commonFactors(12,6));
        System.out.println(commonFactors(25,30));
    }

    public static int commonFactors(int a, int b) {
        int min = Math.min(a, b);
        int count=1;
        for(int i = 2; i<=min; i++){
            if(a%i==0 && b%i==0) count++;
        }
        return count;
    }
}
