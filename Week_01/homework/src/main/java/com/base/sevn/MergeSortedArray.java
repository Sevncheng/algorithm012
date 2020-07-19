package com.base.sevn;

public class MergeSortedArray {

    /**
     * 方法1: 数组拷贝排序
     * 方法2: 双指针，因为nums1是主体，所以循环应该以nums2的n长度为外循环
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int currentSize = m + n -1;
       m--;
       n--;
       while (n >= 0) {
           while (m >= 0 && nums1[m] > nums2[n]) {
               int temp = nums1[m];
               nums1[m--] = 0;
               nums1[currentSize--] = temp;
           }
           nums1[currentSize--] = nums2[n--];
       }
    }
}
