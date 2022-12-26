package com.leo.lab.solution.kotlin.binarytreeinordertraversal

import com.leo.lab.question.BinaryTreeInorderTraversal
import com.leo.lab.question.BinaryTreeInorderTraversal.TreeNode
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test
import java.util.LinkedList

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

    private fun buildBinaryTree(array: Array<Int?>): TreeNode? {
        val queue = LinkedList<TreeNode>()
        var root: TreeNode? = null
        for (value in array) {
            val node = TreeNode(value ?: -1) // if value is null, insert a node with value -1
            if (root == null) {
                root = node
            } else {
                if (queue.peek().`val` == -1) {
                    queue.pop()
                }

                if (queue.peek().left == null) {
                    queue.peek().left = node
                } else if (queue.peek().right == null) {
                    queue.pop().right = node
                }
            }
            queue.add(node)
        }

        // Remove auxiliary node whose value is -1
        root?.let {
            levelOrderTraversal(it) {node ->
                if (node.left?.`val` == -1) {
                    node.left = null
                }

                if (node.right?.`val` == -1) {
                    node.right = null
                }
            }
        }


        root?.let { levelOrderTraversal(it) { node ->
            print("${node.`val`} ")
        }}
        return root
    }

    private fun levelOrderTraversal(root: TreeNode, run: (TreeNode) -> Unit = { }) {
        val queue = LinkedList<TreeNode>()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val node = queue.pop()
            run(node)
            val left = node.left
            if (left != null) {
                queue.add(left)
            }
            val right = node.right
            if (right != null) {
                queue.add(right)
            }
        }
        println("")
    }
}