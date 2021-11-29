package com.leo.lab.solution.kotlin.lengthoflastword

import com.leo.lab.question.LengthOfLastWord
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

/**
 * @author Leo Lu
 * @since 2021/11/29
 */
abstract class BaseLengthOfLastWordTest  : BaseTest<LengthOfLastWord>() {

    @Test
    fun test1() {
        // GIVEN
        val s = "Hello World"

        // WHEN
        val length = tested.lengthOfLastWord(s)

        //THEN
        Assert.assertEquals(5, length)
    }

    @Test
    fun test2() {
        // GIVEN
        val s = "   fly me   to   the moon  "

        // WHEN
        val length = tested.lengthOfLastWord(s)

        //THEN
        Assert.assertEquals(4, length)
    }

    @Test
    fun test3() {
        // GIVEN
        val s = "luffy is still joyboy"

        // WHEN
        val length = tested.lengthOfLastWord(s)

        //THEN
        Assert.assertEquals(6, length)
    }

    @Test
    fun test4() {
        // GIVEN
        val s = ""

        // WHEN
        val length = tested.lengthOfLastWord(s)

        //THEN
        Assert.assertEquals(0, length)
    }

    @Test
    fun test5() {
        // GIVEN
        val s = "a"

        // WHEN
        val length = tested.lengthOfLastWord(s)

        //THEN
        Assert.assertEquals(1, length)
    }

    @Test
    fun test6() {
        // GIVEN
        val s = " "

        // WHEN
        val length = tested.lengthOfLastWord(s)

        //THEN
        Assert.assertEquals(0, length)
    }
}