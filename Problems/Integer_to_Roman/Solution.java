package Integer_to_Roman;


public class Solution {
    public static void main(String[] args) {
        System.out.println(intToRoman(2021));
    }

//    public static String intToRoman(int num) {
//        String m[] = {"", "M", "MM", "MMM"};
//        String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//        String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//        String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//        return m[num/1000] + c[(num%1000)/100] + x[(num%100)/10] + i[num%10];
//    }

    public static String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
}
