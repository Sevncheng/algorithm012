package com.base.sevn;

import org.junit.jupiter.api.Test;

public class TrappingRainWater {

    /**
     * 题目到手两个思路, 暴力和双指针, 但是题目理解起来还是比较费劲, 双指针一开始也没有思路, 使用了动态题解的动态规划
     * 方法1: 暴力
     * 方法2: 动态规划
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int area = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0;
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            int rightMax = 0;
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            int result = Math.min(leftMax, rightMax) - height[i];
            area += result > 0 ? result : 0;
        }
        return area;
    }

    @Test
    public void test() {
        trap(new int[]{2, 0 ,2});
    }
}
