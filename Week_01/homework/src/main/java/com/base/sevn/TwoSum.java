package com.base.sevn;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * 之前做过，直接使用空间换时间的概念增加map存储数组的位置和值
     * 方法1：暴力二重循环 n^2
     * 方法2：使用空间换时间的概念增加map存储数组的位置和值 O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }

        return null;
    }

}
