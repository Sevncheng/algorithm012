package com.base.sevn;

public class TrappingRainWater {

    /**
     * 题目到手两个思路, 暴力和双指针, 但是题目理解起来还是比较费劲, 双指针一开始也没有思路, 使用了动态题解的动态规划
     * 方法1: 暴力
     * 方法2: 动态规划
     * 方法3: 双指针TODO
     * @param height
     * @return
     */
    public int trap(int[] height) {
       int area = 0;
       int length = height.length;
       if (length < 3) return 0;
       int leftMax[] = new int[length];
       int rightMax[] = new int[length];
       leftMax[0] = height[0];
       rightMax[length - 1] = height[length - 1];
        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(leftMax[i -1], height[i]);
        }

        for (int i = length - 2; i >=0 ; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            area += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return area;
    }
}
