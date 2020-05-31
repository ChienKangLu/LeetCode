package com.leo.lab.solution.kotlin.twosum

import com.leo.lab.question.TwoSum

/**
 * @author Leo Lu
 * @since 2020/05/31
 */
class Solution : TwoSum {

    override fun twoSum(nums: IntArray?, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for ((index, value) in nums!!.withIndex()) {
            val remainder = target - value
            val remainderIndex = map[remainder]
            if (remainderIndex != null) {
                return intArrayOf(remainderIndex, index)
            }
            map[value] = index
        }
        return intArrayOf()
    }
}