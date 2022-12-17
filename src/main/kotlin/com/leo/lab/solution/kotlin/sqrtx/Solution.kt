package com.leo.lab.solution.kotlin.sqrtx

import com.leo.lab.question.SqrtX

/**
 * Notice: This solution is not applicable for real world problem because
 * finding square root by binary search will exceed time limit
 */
class Solution : SqrtX {
    override fun mySqrt(x: Int): Int {
        var min = 1
        var max = x
        var mid: Int
        do {
            mid = (max + min) / 2
            val square = mid * mid
            if (square == x) {
                return mid
            } else if (square > x) {
                max = mid - 1
            } else {
                min = mid + 1
            }
        } while (min <= max)
        return min - 1
    }
}