package com.leo.lab.solution.kotlin.climbingstairs

import com.leo.lab.question.ClimbingStairs
import java.math.BigInteger

class Solution : ClimbingStairs {
    override fun climbStairs(n: Int): Int {
        val twoStepMaxNum = n / 2
        var permutation = BigInteger.ZERO
        for (i in 0..twoStepMaxNum) {
            val oneStepNum = n - i * 2
            permutation += factorial(i + oneStepNum) / (factorial(i) * factorial(oneStepNum))
        }
        return permutation.toInt()
    }

    private fun factorial(n: Int): BigInteger {
        var result = BigInteger.ONE
        for (i in 2..n) {
            result = result.multiply(i.toBigInteger())
        }
        return result
    }
}