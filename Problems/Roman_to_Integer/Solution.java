package Roman_to_Integer;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

//    public static int romanToInt(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//        int len = s.length();
//        int sum = map.get(s.charAt(len - 1));
//        for (int i = len - 2; i >= 0; --i) {
//            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
//                sum -= map.get(s.charAt(i));
//            } else {
//                sum += map.get(s.charAt(i));
//            }
//        }
//        return sum;
//    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {
                    result = result + s1;
                } else {
                    result = result + s2 - s1;
                    i++;
                }
            } else {
                result = result + s1;
                i++;
            }
        }
        return result;
    }
    public static int value(int romeNumb) {
        if (romeNumb == 'I')
            return 1;
        if (romeNumb == 'V')
            return 5;
        if (romeNumb == 'X')
            return 10;
        if (romeNumb == 'L')
            return 50;
        if (romeNumb == 'C')
            return 100;
        if (romeNumb == 'D')
            return 500;
        if (romeNumb == 'M')
            return 1000;
        return -1;
    }
}
