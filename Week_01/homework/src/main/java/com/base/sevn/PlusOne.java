package com.base.sevn;

public class PlusOne {

    /**
     * 题目一开始都没看懂, 本质的意思是输入的数组其实是一个整数数字, 在这个基础上加1后以再以数组的形式返回
     * 方法1(不行): 暴力做, 直接将数组转数字, 然后加1, 后拆解成数组返回, 但是由于整数长度有限, 即使是long也是不行滴
     * 方法2: 从数组末尾开始循环, 增加后的值不能超过9, 需要除以10取余数, 最后模拟出需要进1情况(这里没有使用进阶短写, 留置NEXT)
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        boolean needPlusOne = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (!needPlusOne) {
                break;
            }
            digits[i] = (digits[i] + 1) % 10;
            needPlusOne = (digits[i] == 0);
        }

        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
