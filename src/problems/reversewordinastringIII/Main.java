package problems.reversewordinastringIII;

public class Main {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));

    }




    public static String reverseWords(String s) {
        char [] array = s.toCharArray();
        int left = 0;
        int right = 0;
        while(right<array.length){
            if(array[right]==' '){
                reverse(array,left,right-1);
                left = right + 1;
            }
            right++;
        }
        reverse(array,left,right-1);

        return new String(array);
    }
    public static void reverse(char [] arr, int left, int right){
        while (left<right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
