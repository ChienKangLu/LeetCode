package com.leo.lab.solution.kotlin.reverseinteger

import com.leo.lab.question.ReverseInteger

/**
 * @author Leo Lu
 * @since 2020/06/06
 */
class Solution : ReverseInteger {

    companion object {
        private const val MAX_BASE = Integer.MAX_VALUE / 10
        private const val MIN_BASE = Integer.MIN_VALUE / 10
        private const val MAX_INCREMENT = Integer.MAX_VALUE % 10
        private const val MIN_REDUCTION = Integer.MIN_VALUE % 10
        private const val OVERFLOW_REVERSE_INTEGER = 0
    }

    override fun reverse(x: Int): Int {
        var rev = 0
        var xVar = x
        while (xVar != 0) {
            val pop = xVar % 10
            if (rev > MAX_BASE || rev == MAX_BASE && pop > MAX_INCREMENT) {
                return OVERFLOW_REVERSE_INTEGER
            }
            if (rev < MIN_BASE || rev == MIN_BASE && pop < MIN_REDUCTION) {
                return OVERFLOW_REVERSE_INTEGER
            }
            rev = rev * 10 + pop
            xVar /= 10
        }
        return rev
    }
}