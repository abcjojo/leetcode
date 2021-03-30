package com.java.leetcode.algorithms;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class Question1 {

    /**
     *  思路：用两个hashmap分别保存下表和值、值和下标， 然后遍历数组，用target-当前值=期望值，然后再map中get期望值，
     *          如果找到期望值就返回下标
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map2.put(nums[i], i);
        }

        int exp;    // 期望值下标
        for (int i = 0; i < nums.length; i++) {
            exp = map2.get(target - nums[i]) == null ? -1 : map2.get(target - nums[i]);

            // 同一个值不能重复使用
            if (exp == i) {
                continue;
            }

            if (exp == -1) {
                continue;
            }else {
                result[0] = i;
                result[1] = exp;
                break;
            }
        }

        return result;
    }

    @Test
    public void test() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = this.twoSum(nums, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

}
