package longest_substring;

import java.util.*;

public class Main
{
    public static void main(String[] args) {


        String str = "abcdabcbb";
       System.out.println(lengthOfLongestSubstring(str));


    }


    public static int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        int result = 0;
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                if(result<list.size()){
                    result = list.size();
                }
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }

        }
        return result;

    }
}
