package com.leo.lab.solution.kotlin.binarytreeinordertraversal

import com.leo.lab.question.BinaryTreeInorderTraversal
import com.leo.lab.question.datastructure.TreeNode

class Solution2 : BinaryTreeInorderTraversal {
    override fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        inorder(root, list)
        return list
    }

    private fun inorder(root: TreeNode?, list: MutableList<Int>) {
        if (root != null) {
            inorder(root.left, list)
            list.add(root.`val`)
            inorder(root.right, list)
        }
    }
}