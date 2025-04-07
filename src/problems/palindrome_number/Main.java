package palindrome_number;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

        public static boolean isPalindrome(int x) {
            int summa = 0, k = x;
            while(x>0){
                int m = x%10;
                summa = summa*10 + m;
                x = x/10;
            }
            return summa == k ;
        }

}
