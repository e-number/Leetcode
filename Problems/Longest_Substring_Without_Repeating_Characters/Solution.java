package Longest_Substring_Without_Repeating_Characters;
import java.util.*;

public class Solution {
    public static void main(String[] args)
    {
        System.out.println(longestSubstringWithoutRepeatingCharacters("abcabcbb"));
    }


//    public static int longestSubstringWithoutRepeatingCharacters(String s) {
//        int max = 0;
//        if (s.length() == 0) return 0;
//        Map <Character,Integer> map = new HashMap<>();
//        int start = 0;
//        for (int i = 0; i < s.length(); i++) {
//             if (map.containsKey(s.charAt(i))) {
//                 start = Math.max(start, map.get(s.charAt(i)) + 1);
//             }
//            map.put(s.charAt(i), i);
//            max = Math.max(max, i - start + 1);
//        }
//        return max;
//    }

    public static int longestSubstringWithoutRepeatingCharacters(String s)
    {
        if (s.length() == 0) return 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            CharSequence cs = "" + s.charAt(i);
            if(!result.toString().contains(cs))
            {
                result.append(cs);
            }
        }
        return result.length();
    }
}
