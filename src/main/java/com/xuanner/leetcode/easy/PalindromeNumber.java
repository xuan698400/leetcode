package com.xuanner.leetcode.easy;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * Input: 121
 * Output: true
 * <p>
 * Example 2:
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * Input: 10
 * Output: falseffdfd
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * @author xuan
 * @since 2019/4/17
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return doReverseNum(x) == x;
    }

    private static long doReverseNum(long num) {
        long result = 0;
        while (true) {
            long n = num % 10;
            result = result * 10 + n;
            num = num / 10;
            if (num == 0) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(PalindromeNumber.isPalindrome(121));
        System.out.println(PalindromeNumber.isPalindrome(-121));
        System.out.println(PalindromeNumber.isPalindrome(10));
    }

}
