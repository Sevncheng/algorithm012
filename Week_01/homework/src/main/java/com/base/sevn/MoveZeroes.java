package com.base.sevn;

public class MoveZeroes {

    /**
     * 这里看题解 有两种方法 分为两次遍历和一次遍历，直接采用一次遍历
     * 方法1：一次遍历的方法还是运用到了双指针的思路
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
                current++;
            }
        }

    }

}
