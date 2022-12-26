package com.leo.lab.solution.kotlin.binarytreeinordertraversal

import com.leo.lab.question.BinaryTreeInorderTraversal
import com.leo.lab.question.BinaryTreeInorderTraversal.TreeNode
import java.util.*

class Solution : BinaryTreeInorderTraversal {
    override fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        val stack = Stack<TreeNode>()
        var current: TreeNode? = root
        while (current != null || stack.isNotEmpty()) {
            if (current != null) {
                stack.add(current)
                current = current.left
            } else {
                val node = stack.pop()
                list.add(node.`val`)
                current = node.right
            }
        }
        return list
    }
}