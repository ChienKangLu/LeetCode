package com.leo.lab.solution.kotlin.maximumsubarray

import com.leo.lab.question.MaximumSubarray
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

/**
 * @author Leo Lu
 * @since 2021/11/26
 */
abstract class BaseMaximumSubarrayTest : BaseTest<MaximumSubarray>() {

    @Test
    fun test1() {
        // GIVEN
        val array = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)

        // WHEN
        val sum = tested.maxSubArray(array)

        // THEN
        Assert.assertEquals(6, sum)
    }

    @Test
    fun test2() {
        // GIVEN
        val array = intArrayOf(1)

        // WHEN
        val sum = tested.maxSubArray(array)

        // THEN
        Assert.assertEquals(1, sum)
    }

    @Test
    fun test3() {
        // GIVEN
        val array = intArrayOf(5, 4, -1, 7, 8)

        // WHEN
        val sum = tested.maxSubArray(array)

        // THEN
        Assert.assertEquals(23, sum)
    }
}