package com.leo.lab.solution.java.longestcommonprefix;

import com.leo.lab.question.LongestCommonPrefix;

/**
 * @author Leo Lu
 * @since 2020/06/08
 */
public class Solution implements LongestCommonPrefix {

    @Override
    public String longestCommonPrefix(String[] strs) {
        if (strs == null ||strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder prefix = new StringBuilder();
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }
        return prefix.toString();
    }
}
