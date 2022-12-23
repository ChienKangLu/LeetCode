package com.leo.lab.question

interface MergeSortedArray : Question {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit
}