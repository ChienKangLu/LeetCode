package com.leo.lab.solution.kotlin.plusone

import com.leo.lab.question.PlusOne

/**
 * @author Leo Lu
 * @since 2021/11/29
 */
class Solution2 : PlusOne {

    override fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] == 9) {
                digits[i] = 0
            } else {
                digits[i] += 1
                return digits
            }
        }
        return IntArray(digits.size + 1).apply {
            this[0] = 1
        }
    }
}