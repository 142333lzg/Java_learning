package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。
如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。

注意：
对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
如果 s 中存在这样的子串，我们保证它是唯一的答案。
*/
public class leetcode76 {
    public String minWindow(String s, String t) {
        char[] scharArray = s.toCharArray();
        char[] tcharArray = t.toCharArray();
        int i = 0, j = 0, minleft = 0, minright = 0, minlen = Integer.MAX_VALUE;
        while(i <= j && j < scharArray.length) {
            char[] subcharArray = Arrays.copyOfRange(scharArray, i, j + 1);
            if(tinSubstring(subcharArray, tcharArray)) {
                if(j - i + 1 < minlen) {
                    minleft = i;
                    minright = j;
                    minlen = j - i + 1;
                }
                i++;
            }
            else {
                j++;
            }
        }
        if(minlen == Integer.MAX_VALUE) return "";
        else return s.substring(minleft, minright + 1);
    }

    public boolean tinSubstring(char[] substring, char[] tcharArray) {
        if (substring.length < tcharArray.length)
            return false;
        int tcharsum = 0;
        Map<Character, Integer> tMap = new HashMap<>();
        // 构建t的HashMap
        for (char tchar : tcharArray) {
            if (tMap.containsKey(tchar)) {
                tMap.put(tchar, tMap.get(tchar) + 1);
            } else {
                tMap.put(tchar, 1);
            }
            tcharsum += 1;
        }
        // 遍历substring
        for (char schar : substring) {
            if (tMap.containsKey(schar) && tMap.get(schar) > 0) {
                tMap.put(schar, tMap.get(schar) - 1);
                tcharsum -= 1;
            } else
                continue;
        }
        // 检验是否所有的键对应的值（数量）之和为零
        return tcharsum == 0;

    }
}
