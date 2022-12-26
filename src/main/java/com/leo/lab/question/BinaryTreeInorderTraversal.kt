package com.leo.lab.question

interface BinaryTreeInorderTraversal : Question {

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun inorderTraversal(root: TreeNode?): List<Int>
}