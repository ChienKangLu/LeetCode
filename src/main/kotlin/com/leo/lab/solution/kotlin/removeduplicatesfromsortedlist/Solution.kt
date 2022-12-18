package com.leo.lab.solution.kotlin.removeduplicatesfromsortedlist

import com.leo.lab.question.ListNode
import com.leo.lab.question.RemoveDuplicatesFromSortedList

class Solution : RemoveDuplicatesFromSortedList {
    override fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while (current != null) {
            var next = current.next
            while (current.`val` == next?.`val`) {
                next = next.next
            }
            current.next = next
            current = next
        }
        return head
    }
}