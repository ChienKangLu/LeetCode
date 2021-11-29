package com.leo.lab.solution.kotlin.plusone

import com.leo.lab.question.PlusOne
import java.util.*

/**
 * @author Leo Lu
 * @since 2021/11/29
 */
class Solution : PlusOne {

    override fun plusOne(digits: IntArray): IntArray {
        val stack = Stack<Int>()
        stack.push(1)
        for (i in digits.size - 1 downTo 0) {
            val carryDigit = if ((digits.size - i) == stack.size) stack.pop() else 0
            val digit = digits[i] + carryDigit
            if (digit == 10) {
                stack.push(0)
                stack.push(1)
            } else {
                stack.push(digit)
            }
        }
        return stack.stackToDigits()
    }

    private fun Stack<Int>.stackToDigits(): IntArray {
        val array = IntArray(size)
        for (i in 0 until size) {
            array[i] = pop()
        }
        return array
    }
}