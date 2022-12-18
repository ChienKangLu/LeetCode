package com.leo.lab.question

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

interface RemoveDuplicatesFromSortedList : Question {
    fun deleteDuplicates(head: ListNode?): ListNode?
}