package com.leo.lab.solution.kotlin.maximumsubarray

import com.leo.lab.question.MaximumSubarray

/**
 * @author Leo Lu
 * @since 2021/11/28
 */
class Solution3 : MaximumSubarray {

    // Time complexity: T(n) = 2T(n/2) + Θ(n)
    override fun maxSubArray(nums: IntArray): Int {
        return maxSubArray(nums, 0, nums.size - 1)
    }

    private fun maxSubArray(nums: IntArray, left: Int, right: Int): Int {
        if (left == right) {
            return nums[left]
        }

        val m = (left + right) / 2
        val leftMaxSum = maxSubArray(nums, left, m)
        val rightMaxSum = maxSubArray(nums, m + 1, right)
        val middleMaxSum = middleSubArray(nums, m, left, right)
        return maxOf(leftMaxSum, rightMaxSum, middleMaxSum)
    }

    private fun middleSubArray(nums: IntArray, m: Int, left: Int, right: Int): Int {
        var sum = 0
        var leftMaxSum = Int.MIN_VALUE
        for (i in m downTo left) {
            sum += nums[i]
            if (sum > leftMaxSum) {
                leftMaxSum = sum
            }
        }
        sum = 0
        var rightMaxSum = Int.MIN_VALUE
        for (i in m + 1..right) {
            sum += nums[i]
            if (sum > rightMaxSum) {
                rightMaxSum = sum
            }
        }
        return maxOf(leftMaxSum, rightMaxSum, leftMaxSum + rightMaxSum)
    }
}