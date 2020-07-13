package com.base.sevn;

public class RemoveDuplicatesFromSortedArray {

    /**
     * 题目理解比较费劲，有两点注意点
     * 第一: 返回值为移除数组的长度
     * 第二: 原数组使用引用方式, 并更改原数组开头内容为实际上去重之后的结果
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        // 前置判定数组为空或者长度等于0 直接返回
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int first = 0;
        // 循环主体为尾部指针
        for (int last = first + 1; last < nums.length; last++) {
            // 如果不相等，则将头部指针前移后赋值为当前尾部指针值
            if (nums[first] != nums[last]) {
                nums[++first] = nums[last];
            }
        }
        return first + 1;
    }
}
