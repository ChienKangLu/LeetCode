package com.leo.lab.solution.kotlin.maximumsubarray

import com.leo.lab.question.MaximumSubarray

/**
 * @author Leo Lu
 * @since 2021/11/25
 */
class Solution : MaximumSubarray {

    // Time complexity: O(N^2)
    // Time Limit Exceeded.....
    override fun maxSubArray(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        for (i in 0 until nums.size) {
            var subMax = 0
            for (j in i until nums.size) {
                subMax += nums[j]
                if (subMax > max) {
                    max = subMax
                }
            }
        }
        return max
    }
}