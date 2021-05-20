package com.java.leetcode.algorithms;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Question3 {

    /**
     *  滑动窗口解法：用hashmap保存字符和出现的
     */
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int start = 0, end = 0;
        Set<Character> set = new HashSet<Character>();
        while (start < s.length() && end <s.length()) {
            // 包含下一个字符时，去掉start位置的字符，start++
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }else {
                // 集合中没有下一个字符时候，end位置的字符添加到集合中，end++，计算最大字串长度
                set.add(s.charAt(end));
                end++;
                result = Math.max(result, end - start);
            }
        }

        return result;
    }

    @Test
    public  void main() {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }

}
