package length_of_last_word;

public class Main {
    public static void main(String[] args) {

        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String [] a = s.split(" ");;
        return a[a.length-1].length();
    }
}
