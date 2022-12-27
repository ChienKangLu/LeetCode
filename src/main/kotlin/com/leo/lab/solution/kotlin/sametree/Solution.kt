package com.leo.lab.solution.kotlin.sametree

import com.leo.lab.question.SameTree
import com.leo.lab.question.datastructure.TreeNode
import java.util.LinkedList

class Solution : SameTree {
    override fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        } else if (p == null || q == null) {
            return false
        }

        return levelOrderCompare(p, q)
    }

    private fun levelOrderCompare(root1: TreeNode, root2: TreeNode): Boolean {
        val queue1 = LinkedList<TreeNode>()
        val queue2 = LinkedList<TreeNode>()
        queue1.add(root1)
        queue2.add(root2)
        while (queue1.isNotEmpty() && queue2.isNotEmpty()) {
            val node1 = queue1.pop()
            val node2 = queue2.pop()
            if (node1.`val` != node2.`val`) {
                return false
            }

            val node1HasLeftNode = hasLeftNode(node1, queue1)
            val node2HasLeftNode = hasLeftNode(node2, queue2)
            if (node1HasLeftNode != node2HasLeftNode) {
                return false
            }

            val node1HasRightNode = hasRightNode(node1, queue1)
            val node2HasRightNode = hasRightNode(node2, queue2)
            if (node1HasRightNode != node2HasRightNode) {
                return false
            }

        }
        return queue1.isEmpty() && queue2.isEmpty()
    }

    private fun hasLeftNode(node: TreeNode, queue: LinkedList<TreeNode>): Boolean {
        return node.left?.let {
            queue.add(it)
            true
        } ?: false
    }

    private fun hasRightNode(node: TreeNode, queue: LinkedList<TreeNode>): Boolean {
        return node.right?.let {
            queue.add(it)
            true
        } ?: false
    }
}