package com.java.leetcode.algorithms;


import org.junit.Test;

/**
 *
 *  两个数组合并后的中位数
 */
public class Question4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // 中位数结束下标
        int midIndex = (nums1.length + nums2.length) / 2;
        int len = nums1.length + nums2.length;
        int[] nums = new int[len];
        // p->nums;  p1->nums1;  p2->nums2
        int p = 0, p1 = 0, p2 = 0;
        while (p <= midIndex) {

            // nums1耗尽，直接复制nums2剩余的数据
            if (p1 >= nums1.length) {
                nums[p] = nums2[p2];
                p++;
                p2++;
                continue;
            }

            // nums2耗尽，直接复制nums1剩余的数据
            if (p2 >= nums2.length) {
                nums[p] = nums1[p1];
                p++;
                p1++;
                continue;
            }

            // 如果nums1、nums2 都未耗尽时，添加较小的数
            if (nums1[p1] < nums2[p2]) {
                nums[p] = nums1[p1];
                p++;
                p1++;
            }else {
                nums[p] = nums2[p2];
                p++;
                p2++;
            }
        }
        System.out.println("--------");

        double result = len % 2 == 0 ? (nums[midIndex] + nums[midIndex - 1]) / 2d : nums[midIndex];
        return result;
    }
    @Test
    public void test() {
        int[]nums1 = {1,2}, nums2 = {3,4};
        System.out.println(this.findMedianSortedArrays(nums1, nums2));
    }
}
