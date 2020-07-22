package com.base.sevn;

/**
 * @program:
 * @description:
 * @author: sevn cy
 * @create: 2020-07-21 20:07
 **/
public class ValidAnagram {

    /**
     * 之前看过视频的讲解, 两个方法, 第一个全部转小写 sort后比较, 第二个使用哈希
     * 方法1: 暴力sort
     * 方法2: 哈希
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}
