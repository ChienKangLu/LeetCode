package com.leo.lab.solution.kotlin.maximumsubarray

import com.leo.lab.question.MaximumSubarray

/**
 * @author Leo Lu
 * @since 2021/11/25
 */
class Solution2 : MaximumSubarray {

    // Time complexity: O(N)
    override fun maxSubArray(nums: IntArray): Int {
        var maxSum = Int.MIN_VALUE
        var currSum = 0
        for (num in nums) {
            currSum += num
            if (currSum > maxSum) {
                maxSum = currSum
            }
            if (currSum < 0) {
                currSum = 0
            }
        }
        return maxSum
    }
}