package plus_one;

public class helper {
    public static void main(String[] args) {
        int [] digits = {1,2,3,9};
        int summa = 0;int n = 1;
        for(int i = digits.length-1; i>-1; i--){
            summa = summa + digits[i]*n;
            n = n*10;
        }

        System.out.println("summa = "+summa);
    }
}
