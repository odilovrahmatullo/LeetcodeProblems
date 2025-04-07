package count_primes;

public class Main {
    public static void main(String[] args) {

        System.out.println(countPrimes(20));
        //countPrimes(10000);

    }

    public static int countPrimes(int n) {
        if(n<3){
            return 0;
        }

        boolean [] bool = new boolean[n];
        int count = 0;

        for(int i = 2; i<Math.sqrt(n); i++){
            if(!bool[i]) {
                for (int j = i * i; j < n; j += i) {
                    bool[j] = true;
                }
            }

        }

        for(int i = 2; i<n; i++){
            if(!bool[i]){
                count++;
            }
        }

        return count;

    }
}
