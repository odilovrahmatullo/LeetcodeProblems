package add_digits;

public class Main {
    public static void main(String[] args) {
        System.out.println(addDigits(10));

    }

    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }
        return (num%9==0)?9:num%9;
    }
}
