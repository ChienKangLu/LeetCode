package com.leo.lab.solution.kotlin.mergesortedarray

import com.leo.lab.question.MergeSortedArray

class Solution2 : MergeSortedArray {
    override fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val total = m + n
        var i = total - 1
        var nums1Index = m - 1
        var nums2Index = n - 1

        do {
            val num1 = if (nums1Index >= 0) nums1[nums1Index] else Int.MIN_VALUE
            val num2 = if (nums2Index >= 0) nums2[nums2Index] else Int.MIN_VALUE
            if (num1 > num2) {
                nums1[i--] = num1
                nums1Index--
            } else {
                nums1[i--] = num2
                nums2Index--
            }
        } while (i >= 0)
    }
}