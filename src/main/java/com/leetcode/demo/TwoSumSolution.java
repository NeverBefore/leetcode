package com.leetcode.demo;

/**
 *  给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *  你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  给定 nums = [2, 7, 11, 15], target = 9
 *  因为 nums[0] + nums[1] = 2 + 7 = 9
 *  所以返回 [0, 1]
 *
 * @author lisheng
 * @description 两数之和
 * @date 2020/11/6
 */

public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i1] + nums[i] == target) {
                    return new int[]{i, i1};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{2, 11, 11, 15};
        int target = 17;
        int[] sum = twoSum(ints, target);
        for (int i : sum) {
            System.out.println(i);
        }
    }
}
