package com.xuanner.leetcode.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * Input: 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: 120
 * Output: 21
 *
 * @author xuan
 * @since 2019/4/16
 */
public class ReverseInteger {

    public static int reverseNum(int x) {
        long num = x;

        if (0 == num) {
            return 0;
        }

        if (num > 0) {
            long result = doReverseNum(num);
            return result > Integer.MAX_VALUE ? 0 : (int) result;
        } else {
            long result = -doReverseNum(-num);
            return result < Integer.MIN_VALUE ? 0 : (int) result;
        }
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
        System.out.println(ReverseInteger.reverseNum(123));
        System.out.println(ReverseInteger.reverseNum(-123));
        System.out.println(ReverseInteger.reverseNum(120));
        System.out.println(ReverseInteger.reverseNum(1534236469));
        System.out.println(ReverseInteger.reverseNum(-2147483648));

    }

}
