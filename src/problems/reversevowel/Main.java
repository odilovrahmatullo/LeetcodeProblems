package problems.reversevowel;

public class Main {

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }


    public static String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;
        while (right > left) {
            if(!vowels[c[left]]){
                left++;
            }
            if(!vowels[c[right]]){
                right--;
            }

            if(vowels[c[left]] && vowels[c[right]]){
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }

        }

        return new String(c);

    }

}
