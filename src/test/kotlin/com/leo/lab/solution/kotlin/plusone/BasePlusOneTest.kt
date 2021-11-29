package com.leo.lab.solution.kotlin.plusone

import com.leo.lab.question.PlusOne
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

/**
 * @author Leo Lu
 * @since 2021/11/29
 */
abstract class BasePlusOneTest : BaseTest<PlusOne>() {

    @Test
    fun test1() {
        // GIVEN
        val digits = intArrayOf(1, 2, 3)

        // WHEN
        val output = tested.plusOne(digits)

        // THEN
        val expecteds = intArrayOf(1, 2, 4)
        Assert.assertArrayEquals(expecteds, output)
    }

    @Test
    fun test2() {
        // GIVEN
        val digits = intArrayOf(4, 3, 2, 1)

        // WHEN
        val output = tested.plusOne(digits)

        // THEN
        val expecteds = intArrayOf(4, 3, 2, 2)
        Assert.assertArrayEquals(expecteds, output)
    }

    @Test
    fun test3() {
        // GIVEN
        val digits = intArrayOf(0)

        // WHEN
        val output = tested.plusOne(digits)

        // THEN
        val expecteds = intArrayOf(1)
        Assert.assertArrayEquals(expecteds, output)
    }

    @Test
    fun test4() {
        // GIVEN
        val digits = intArrayOf(9)

        // WHEN
        val output = tested.plusOne(digits)

        // THEN
        val expecteds = intArrayOf(1, 0)
        Assert.assertArrayEquals(expecteds, output)
    }

    @Test
    fun test5() {
        // GIVEN
        val digits = intArrayOf(9, 9, 9)

        // WHEN
        val output = tested.plusOne(digits)

        // THEN
        val expecteds = intArrayOf(1, 0, 0, 0)
        Assert.assertArrayEquals(expecteds, output)
    }
}