package power_of_two;

public class Mian {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(92));
    }


    public static boolean isPowerOfTwo(int num) {

        return num>0 && (num&(num-1))==0;
    }
}