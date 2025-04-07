package reverse_integer;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));

    }

    public static int reverse(int x) {

        int summa = 0;
        while(Math.abs(x)>0 && x>pow(-2,31) && x<pow(2,31)-1){
          int m = x%10;
          x = x/10;
          summa = summa*10+m;
        }
      return summa;
    }
}
