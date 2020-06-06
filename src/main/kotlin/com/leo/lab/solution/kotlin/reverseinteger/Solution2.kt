package com.leo.lab.solution.kotlin.reverseinteger

import com.leo.lab.question.ReverseInteger

/**
 * @author Leo Lu
 * @since 2020/06/06
 */
class Solution2 : ReverseInteger {

    override fun reverse(x: Int): Int {
        var x = x
        var rev = 0L
        while (x != 0) {
            val pop = x % 10
            rev = rev * 10 + pop
            x /= 10
        }
        return if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            0
        } else {
            rev.toInt()
        }
    }
}