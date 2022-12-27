package com.leo.lab.question

import com.leo.lab.question.datastructure.TreeNode

interface SameTree : Question {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean
}