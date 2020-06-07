package com.leo.lab.solution.kotlin.romantointeger

import com.leo.lab.question.RomanToInteger

/**
 * @author Leo Lu
 * @since 2020/06/07
 */
class Solution : RomanToInteger {

    companion object {
        private const val I = 'I'
        private const val I_VALUE = 1
        private const val V = 'V'
        private const val V_VALUE = 5
        private const val X = 'X'
        private const val X_VALUE = 10
        private const val L = 'L'
        private const val L_VALUE = 50
        private const val C = 'C'
        private const val C_VALUE = 100
        private const val D = 'D'
        private const val D_VALUE = 500
        private const val M = 'M'
        private const val M_VALUE = 1000
        private val ROMAN_MAP = hashMapOf(
            I to I_VALUE, V to V_VALUE, X to X_VALUE,
            L to L_VALUE, C to C_VALUE, D to D_VALUE,
            M to M_VALUE
        )
    }

    override fun romanToInt(s: String?): Int {
        val s = if (!s.isNullOrEmpty()) s else return 0
        val lastIndex = s.lastIndex
        var sum = ROMAN_MAP[s.last()] ?: return 0
        for (i in lastIndex - 1 downTo 0) {
            val current = s[i]
            val next = s[i + 1]
            var currentValue: Int = ROMAN_MAP[current] ?: return 0
            val nextValue: Int = ROMAN_MAP[next] ?: return 0
            if (currentValue < nextValue) {
                currentValue *= -1
            }
            sum += currentValue
        }
        return sum
    }
}