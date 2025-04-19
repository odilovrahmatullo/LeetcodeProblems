package problems.reversestringII;

public class Main {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 8;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        char[] subArray = s.toCharArray();
        for (int i = 0; i < subArray.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, subArray.length - 1);
            reverse(subArray, left, right);
        }
        return String.valueOf(subArray);
    }

    public static void reverse(char[] subArray, int left, int right) {
        while (right > left) {
            char temp = subArray[left];
            subArray[left++] = subArray[right];
            subArray[right--] = temp;
        }
    }
}
