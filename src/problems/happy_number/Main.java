package happy_number;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int n = 3;

        boolean b = isHappy(n);
        System.out.println(sqrt(3));

        System.out.println("b = " + b);


    }
    //solution 1

/*    public static boolean isHappy(int n) {

        Set<Integer> setList = new HashSet<>();

        while (true) {

            double summa = 0;
            while (n != 0) {
                summa = summa + Math.pow(n % 10, 2.0);
                n = n / 10;
            }

            if (summa == 1) {
                return true;
            }
            n = (int) summa;

            if (setList.contains(n)) {
                return false;
            }

            setList.add(n);


        }
    }*/

    // solution 2

    public static boolean isHappy(int n) {

      int slow = n;
      int fast = n;
      do{
          slow = sqrt(slow);
          fast = sqrt(sqrt(fast));
      }
      while (slow != fast);

      return slow==1;

    }

    public static int sqrt(int number){

        int summa = 0;
        while(number>0){
            int m = number%10;
            summa+=m*m;
            number/=10;
        }
        return summa;

    }

}

