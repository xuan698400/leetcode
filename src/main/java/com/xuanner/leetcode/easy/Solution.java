package com.xuanner.leetcode.easy;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author xuan
 * @since 2019/4/16
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (i >= (nums.length - 1)) {
                break;
            }

            result[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    result[1] = j;
                    return result;
                }
            }
        }
        //no answer
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
