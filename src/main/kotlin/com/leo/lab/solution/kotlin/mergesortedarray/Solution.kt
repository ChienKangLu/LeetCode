package com.leo.lab.solution.kotlin.mergesortedarray

import com.leo.lab.question.MergeSortedArray

class Solution : MergeSortedArray {
    override fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val mergedArray = IntArray(m + n)
        var mergedIndex = 0
        var nums1Index = 0
        var nums2Index = 0
        while (nums1Index != m || nums2Index != n) {
            val num1 = if (nums1Index < m) nums1[nums1Index] else Int.MAX_VALUE
            val num2 = if (nums2Index < n) nums2[nums2Index] else Int.MAX_VALUE
            if (num1 < num2) {
                mergedArray[mergedIndex] = num1
                nums1Index++;
            } else {
                mergedArray[mergedIndex] = num2
                nums2Index++;
            }
            mergedIndex++
        }
        mergedArray.forEachIndexed { index, value -> nums1[index] = value }
    }
}