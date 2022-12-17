package com.leo.lab.solution.kotlin.sqrtx

import com.leo.lab.question.SqrtX

// Newton’s method
// Xn-1 = Xn - f(Xn) / f'(Xn)
// For square root problem, f(Xn) = Xn^2 - 8 = 0.
// To find the solution of f(Xn) = 0, then f(Xn) = Xn^2 - 8.
class Solution2 : SqrtX {
    override fun mySqrt(x: Int): Int {
        var root = x.toDouble() // guess
        while (true) {
            if ((root * root) - x < 1) {
                return root.toInt()
            }
            root = 0.5 * (root + x / root)
        }
    }
}