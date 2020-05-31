package com.leo.lab.solution.kotlin.twosum

import org.junit.Before
import org.junit.Test

import org.junit.Assert.assertArrayEquals

/**
 * @author Leo Lu
 * @since 2020/05/31
 */
class TwoSumTest {

    @Before
    fun setUp() {

    }

    @Test
    fun `test solution`() {
        // GIVEN
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        // WHEN
        val solution = Solution()
        val indices = solution.twoSum(nums, target)

        // THEN
        assertArrayEquals(intArrayOf(0, 1), indices)
    }
}