package com.leo.lab.solution.kotlin.reverseinteger

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @author Leo Lu
 * @since 2020/06/06
 */
class ReverseIntegerTest2 {

    @Before
    fun setUp() {
        // Do nothing
    }

    @Test
    fun testPositiveInteger() {
        // GIVEN
        val input = 123

        // WHEN
        val solution = Solution2()
        val output = solution.reverse(input)

        // THEN
        Assert.assertEquals(321, output)
    }

    @Test
    fun testNegativeInteger() {
        // GIVEN
        val input = -123

        // WHEN
        val solution = Solution2()
        val output = solution.reverse(input)

        // THEN
        Assert.assertEquals(-321, output)
    }

    @Test
    fun testLargePositiveInteger() {
        // GIVEN
        val input = Integer.MAX_VALUE - 6 // 2147483641

        // WHEN
        val solution = Solution2()
        val output = solution.reverse(input)

        // THEN
        Assert.assertEquals(1463847412, output)
    }

    @Test
    fun testSmallNegativeInteger() {
        // GIVEN
        val input = Integer.MIN_VALUE + 7 // -2147483641

        // WHEN
        val solution = Solution2()
        val output = solution.reverse(input)

        // THEN
        Assert.assertEquals(-1463847412, output)
    }

    @Test
    fun testMaximumInteger() {
        // GIVEN
        val input = Integer.MAX_VALUE // 2147483647

        // WHEN
        val solution = Solution2()
        val output = solution.reverse(input)

        // THEN
        Assert.assertEquals(0, output)
    }

    @Test
    fun testMinimumInteger() {
        // GIVEN
        val input = Integer.MIN_VALUE // -2147483648

        // WHEN
        val solution = Solution2()
        val output = solution.reverse(input)

        // THEN
        Assert.assertEquals(0, output)
    }

    @Test
    fun testOverflow() {
        // GIVEN
        val input = 1534236469

        // WHEN
        val solution = Solution2()
        val output = solution.reverse(input)

        // THEN
        Assert.assertEquals(0, output)
    }
}