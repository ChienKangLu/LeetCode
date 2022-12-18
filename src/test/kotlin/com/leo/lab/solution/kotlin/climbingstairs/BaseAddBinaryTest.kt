package com.leo.lab.solution.kotlin.climbingstairs

import com.leo.lab.question.ClimbingStairs
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

abstract class BaseClimbingStairsTest : BaseTest<ClimbingStairs>() {
    @Test
    fun test1() {
        // GIVEN
        val n = 2

        // WHEN
        val steps = tested.climbStairs(n)

        // THEN
        Assert.assertEquals(2, steps)
    }

    @Test
    fun test2() {
        // GIVEN
        val n = 3

        // WHEN
        val steps = tested.climbStairs(n)

        // THEN
        Assert.assertEquals(3, steps)
    }

    @Test
    fun test3() {
        // GIVEN
        val n = 5

        // WHEN
        val steps = tested.climbStairs(n)

        // THEN
        Assert.assertEquals(8, steps)
    }

    @Test
    fun test4() {
        // GIVEN
        val n = 35

        // WHEN
        val steps = tested.climbStairs(n)

        // THEN
        Assert.assertEquals(14930352, steps)
    }

    @Test
    fun test5() {
        // GIVEN
        val n = 40

        // WHEN
        val steps = tested.climbStairs(n)

        // THEN
        Assert.assertEquals(165580141, steps)
    }
}