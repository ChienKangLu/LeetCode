package com.leo.lab.solution.kotlin.longestcommonprefix

import com.leo.lab.question.LongestCommonPrefix

/**
 * @author Leo Lu
 * @since 2020/06/13
 */
class Solution2 : LongestCommonPrefix {

    override fun longestCommonPrefix(strs: Array<out String>?): String {
        if (strs.isNullOrEmpty()) {
            return ""
        }
        var low = 1
        var high: Int = Integer.MAX_VALUE
        strs.forEach { high = Math.min(high, it.length) }
        while (low <= high) {
            val mid = (low + high) / 2
            if (isCommonPrefix(strs, mid)) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        return strs[0].substring(0, (low + high) / 2)
    }

    private fun isCommonPrefix(strs: Array<out String>, mid: Int): Boolean {
        val commonPrefix = strs[0].substring(0, mid)
        for (i in 1 until strs.size) {
            if (!strs[i].startsWith(commonPrefix)) {
                return false
            }
        }
        return true
    }
}