package ZigZag_Conversion;

import java.util.Scanner;


class Solution {

    public static void main(String[] args) {

        String word = "PAYPALISHIRING";
        int number = 3;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the word you want to Zigzag");
//        String word = scanner.nextLine();
//
//        int number = scanner.nextInt();

        System.out.println(zigZag(word, number));
    }
//    public static String zigZag(String s, int numRows) {
//        char[] c = s.toCharArray();
//        int len = c.length;
//        StringBuffer[] sb = new StringBuffer[numRows];
//        for (int i = 0; i < sb.length; i++) {
//            sb[i] = new StringBuffer();
//        }
//
//        int i = 0;
//        while (i < len) {
//            for (int j = 0; j < numRows && i < len; j++) {
//                sb[j].append(c[i++]);
//            }
//            for (int j = numRows-2; j >= 1 && i < len; j--) {
//                sb[j].append(c[i++]);
//            }
//
//        }
//        for (int j = 1; j < sb.length; j++) {
//            sb[0].append(sb[j]);
//        }
//        return sb[0].toString();
//    }

    public static String zigZag(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int j = 0;
            while (j + i < s.length()) {
                result.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + numRows * 2 - 2 - i < s.length()) {
                    result.append(s.charAt(j + numRows * 2 - 2 - i));
                }
                j += numRows * 2 - 2;
            }
        }
        return result.toString();
    }
}