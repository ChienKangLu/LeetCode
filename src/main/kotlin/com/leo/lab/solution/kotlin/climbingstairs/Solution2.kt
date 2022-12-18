package com.leo.lab.solution.kotlin.climbingstairs

import com.leo.lab.question.ClimbingStairs

// Solution by Dynamic Programming from https://www.youtube.com/watch?v=uHAToNgAPaM
class Solution2 : ClimbingStairs {
    override fun climbStairs(n: Int): Int {
        val table = IntArray(n + 1)
        table[0] = 1 // the number of ways to climb to zero stair
        table[1] = 1 // the number of ways to climb the first stair

        for (i in 2..n) {
            // we can only take two steps at most, thus we may come from the stair before it or two starts before
            table[i] = table[i - 1] + table[i - 2]
        }

        return table[n]
    }
}