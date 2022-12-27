package com.leo.lab.question

import com.leo.lab.question.datastructure.TreeNode

interface BinaryTreeInorderTraversal : Question {

    fun inorderTraversal(root: TreeNode?): List<Int>
}