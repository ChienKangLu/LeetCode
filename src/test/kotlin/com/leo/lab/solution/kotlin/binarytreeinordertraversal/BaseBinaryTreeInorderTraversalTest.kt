package com.leo.lab.solution.kotlin.binarytreeinordertraversal

import com.leo.lab.question.BinaryTreeInorderTraversal
import com.leo.lab.question.datastructure.TreeNode.Companion.buildBinaryTree
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

abstract class BaseClimbingStairsTest : BaseTest<BinaryTreeInorderTraversal>() {
    @Test
    fun test1() {
        // GIVEN
        val array = arrayOf(1, null, 2, 3)
        val root = buildBinaryTree(array)

        // WHEN
        val list = tested.inorderTraversal(root)

        // THEN
        Assert.assertArrayEquals(intArrayOf(1, 3, 2), list.toIntArray())
    }

    @Test
    fun test2() {
        // GIVEN
        val array = arrayOf<Int?>()
        val root = buildBinaryTree(array)

        // WHEN
        val list = tested.inorderTraversal(root)

        // THEN
        Assert.assertArrayEquals(intArrayOf(), list.toIntArray())
    }

    @Test
    fun test3() {
        // GIVEN
        val array = arrayOf<Int?>(1)
        val root = buildBinaryTree(array)

        // WHEN
        val list = tested.inorderTraversal(root)

        // THEN
        Assert.assertArrayEquals(intArrayOf(1), list.toIntArray())
    }

    @Test
    fun test4() {
        // GIVEN
        val array = arrayOf<Int?>(1, 2, 3, 4, 5, 6, 7, 8)
        val root = buildBinaryTree(array)

        // WHEN
        val list = tested.inorderTraversal(root)

        // THEN
        Assert.assertArrayEquals(intArrayOf(8, 4, 2, 5, 1, 6, 3, 7), list.toIntArray())
    }
}