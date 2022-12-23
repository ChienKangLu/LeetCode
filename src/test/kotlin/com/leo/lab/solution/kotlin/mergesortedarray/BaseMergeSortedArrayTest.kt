package com.leo.lab.solution.kotlin.mergesortedarray

import com.leo.lab.question.MergeSortedArray
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

abstract class BaseMergeSortedArrayTest : BaseTest<MergeSortedArray>() {
    @Test
    fun test1() {
        // GIVEN
        val num1 = intArrayOf(1, 2, 3, 0 ,0, 0)
        val m = 3
        val num2 = intArrayOf(2, 5, 6)
        val n = 3

        // WHEN
        tested.merge(num1, m, num2, n)

        // THEN
        Assert.assertArrayEquals(intArrayOf(1, 2, 2, 3, 5, 6), num1)
    }

    @Test
    fun test2() {
        // GIVEN
        val num1 = intArrayOf(1)
        val m = 1
        val num2 = intArrayOf()
        val n = 0

        // WHEN
        tested.merge(num1, m, num2, n)

        // THEN
        Assert.assertArrayEquals(intArrayOf(1), num1)
    }

    @Test
    fun test3() {
        // GIVEN
        val num1 = intArrayOf(0)
        val m = 0
        val num2 = intArrayOf(1)
        val n = 1

        // WHEN
        tested.merge(num1, m, num2, n)

        // THEN
        Assert.assertArrayEquals(intArrayOf(1), num1)
    }
}