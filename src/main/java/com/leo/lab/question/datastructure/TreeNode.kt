package com.leo.lab.question.datastructure

import java.util.LinkedList

class TreeNode(var `val`: Int) {
    companion object {
        private const val PRINT_LEVEL_ORDER = false

        fun buildBinaryTree(array: Array<Int?>): TreeNode? {
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

            if (PRINT_LEVEL_ORDER) {
                root?.let {
                    levelOrderTraversal(it) { node ->
                        print("${node.`val`} ")
                    }
                }
            }
            return root
        }

        private fun levelOrderTraversal(root: TreeNode, run: (TreeNode) -> Unit = { }) {
            val queue = LinkedList<TreeNode>()
            queue.add(root)
            while (queue.isNotEmpty()) {
                val node = queue.pop()
                run(node)
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
            println("")
        }
    }

    var left: TreeNode? = null
    var right: TreeNode? = null
}