package com.leo.lab.solution.kotlin.longestcommonprefix

import com.leo.lab.question.LongestCommonPrefix

/**
 * @author Leo Lu
 * @since 2020/06/13
 */
class Solution : LongestCommonPrefix {

    override fun longestCommonPrefix(strs: Array<out String>?): String {
        if (strs.isNullOrEmpty()) {
            return ""
        }

        return longestCommonPrefix(strs, 0, strs.size - 1)
    }

    private fun longestCommonPrefix(strs: Array<out String>, left: Int, right: Int): String {
        if (left == right) {
            return strs[left]
        }
        val mid = (left + right) / 2
        val prefixLeft = longestCommonPrefix(strs, left, mid)
        val prefixRight = longestCommonPrefix(strs, mid + 1, right)
        return commonPrefix(prefixLeft, prefixRight)
    }

    private fun commonPrefix(prefixLeft: String, prefixRight: String): String {
        val min = Math.min(prefixLeft.length, prefixRight.length)
        for (i in 0 until min) {
            if (prefixLeft[i] != prefixRight[i]) {
                return prefixLeft.substring(0, i)
            }
        }
        return prefixLeft.substring(0, min)
    }
}