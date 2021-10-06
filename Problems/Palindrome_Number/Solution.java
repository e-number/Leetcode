package Palindrome_Number;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(010));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int a, r = 0, data = x;
        while (x != 0) {
            a = x % 10;
            x = x / 10;
            r = r * 10 + a;
        }
        return data == r;
    }
}
