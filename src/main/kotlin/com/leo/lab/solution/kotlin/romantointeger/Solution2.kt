package com.leo.lab.solution.kotlin.romantointeger

import com.leo.lab.question.RomanToInteger

/**
 * @author Leo Lu
 * @since 2020/06/07
 */
class Solution2 : RomanToInteger {

    override fun romanToInt(s: String?): Int {
        val s = if (!s.isNullOrEmpty()) s else return 0
        val lastIndex = s.lastIndex
        var sum = getIntegerByChar(s.last()) ?: return 0
        for (i in lastIndex - 1 downTo 0) {
            val current = s[i]
            val next = s[i + 1]
            var currentValue: Int = getIntegerByChar(current) ?: return 0
            val nextValue: Int = getIntegerByChar(next) ?: return 0
            if (currentValue < nextValue) {
                currentValue *= -1
            }
            sum += currentValue
        }
        return sum
    }

    private fun getIntegerByChar(c: Char): Int? = when (c) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> null
    }
}