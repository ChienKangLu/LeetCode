package com.leo.lab.solution.kotlin.sqrtx

import com.leo.lab.question.SqrtX
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

abstract class BaseSqrtXTest : BaseTest<SqrtX>() {
    @Test
    fun test1() {
        // GIVEN
        val x = 4

        // WHEN
        val result = tested.mySqrt(x)

        // THEN
        Assert.assertEquals(2, result)
    }

    @Test
    fun test2() {
        // GIVEN
        val x = 8

        // WHEN
        val result = tested.mySqrt(x)

        // THEN
        Assert.assertEquals(2, result)
    }

    @Test
    fun test3() {
        // GIVEN
        val x = 100

        // WHEN
        val result = tested.mySqrt(x)

        // THEN
        Assert.assertEquals(10, result)
    }

    @Test
    fun test4() {
        // GIVEN
        val x = 3

        // WHEN
        val result = tested.mySqrt(x)

        // THEN
        Assert.assertEquals(1, result)
    }

    @Test
    fun test5() {
        // GIVEN
        val x = 2147395599

        // WHEN
        val result = tested.mySqrt(x)

        // THEN
        Assert.assertEquals(46339, result)
    }

    @Test
    fun test6() {
        // GIVEN
        val x = 1

        // WHEN
        val result = tested.mySqrt(x)

        // THEN
        Assert.assertEquals(1, result)
    }
}