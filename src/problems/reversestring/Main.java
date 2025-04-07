package problems.reversestring;

public class Main {
    public static void main(String[] args) {
      char []  s = {'h','e','l','l','o'};
      reverseString(s);

    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(right>left){
            char temp = s[left];
            s[left++]=s[right];
            s[right--]=temp;
        }

        System.out.println(s);
    }
}
