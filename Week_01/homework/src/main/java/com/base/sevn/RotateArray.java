package com.base.sevn;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RotateArray {

    /**
     * tips: 这里数组的实际挪动位置为 期望长度 / 实际数组长度 取余数
     * 方法1: 直接暴力破解 时间复杂度n^2 双重循环每次步长都是1
     * 方法2: 增加新数组直接存放目标值
     * 方法3: 环状替换TODO
     * 方法4: 反转
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 1 || k < 1) {
            return;
        }
        int actualRemove = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, actualRemove - 1);
        reverse(nums, actualRemove, nums.length - 1);
    }

    public void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }

    @Test
    public void test() {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
