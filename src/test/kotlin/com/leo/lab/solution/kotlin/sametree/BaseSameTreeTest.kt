package com.leo.lab.solution.kotlin.sametree

import com.leo.lab.question.SameTree
import com.leo.lab.question.datastructure.TreeNode.Companion.buildBinaryTree
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

abstract class BaseSameTreeTest : BaseTest<SameTree>() {
    @Test
    fun test1() {
        // GIVEN
        val tree1 = buildBinaryTree(arrayOf(1, 2, 3))
        val tree2 = buildBinaryTree(arrayOf(1, 2, 3))

        // WHEN
        val isSameTree = tested.isSameTree(tree1, tree2)

        // THEN
        Assert.assertTrue(isSameTree)
    }

    @Test
    fun test2() {
        // GIVEN
        val tree1 = buildBinaryTree(arrayOf(1, 2))
        val tree2 = buildBinaryTree(arrayOf(1, null, 2))

        // WHEN
        val isSameTree = tested.isSameTree(tree1, tree2)

        // THEN
        Assert.assertFalse(isSameTree)
    }

    @Test
    fun test3() {
        // GIVEN
        val tree1 = buildBinaryTree(arrayOf(1, 2, 1))
        val tree2 = buildBinaryTree(arrayOf(1, 1, 2))

        // WHEN
        val isSameTree = tested.isSameTree(tree1, tree2)

        // THEN
        Assert.assertFalse(isSameTree)
    }
}