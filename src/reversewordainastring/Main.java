package reversewordainastring;

public class Main {
    public static void main(String[] args) {

        String s = "a good   example";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        String result = s.replaceAll("\\s+", " ").trim();
        String [] str = result.split(" ");
        int left = 0;
        int right = str.length-1;
        while(left<=right){
            String temp = str[left].trim();
            str[left++]=str[right].trim();
            str[right--]=temp;
        }
        return String.join(" ",str);
    }
}
