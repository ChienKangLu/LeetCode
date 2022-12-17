package com.leo.lab.solution.kotlin.addbinary

import com.leo.lab.question.AddBinary
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

abstract class BaseAddBinaryTest : BaseTest<AddBinary>() {
    @Test
    fun test1() {
        // GIVEN
        val binaryString1 = "11"
        val binaryString2 = "1"

        // WHEN
        val sumBinaryString = tested.addBinary(binaryString1, binaryString2)

        // THEN
        Assert.assertEquals("100", sumBinaryString)
    }

    @Test
    fun test2() {
        // GIVEN
        val binaryString1 = "1010"
        val binaryString2 = "1011"

        // WHEN
        val sumBinaryString = tested.addBinary(binaryString1, binaryString2)

        // THEN
        Assert.assertEquals("10101", sumBinaryString)
    }

    @Test
    fun test3() {
        // GIVEN
        val binaryString1 = "1111"
        val binaryString2 = "1111"

        // WHEN
        val sumBinaryString = tested.addBinary(binaryString1, binaryString2)

        // THEN
        Assert.assertEquals("11110", sumBinaryString)
    }
}