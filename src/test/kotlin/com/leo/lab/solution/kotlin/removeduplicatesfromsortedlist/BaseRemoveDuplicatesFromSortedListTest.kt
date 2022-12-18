package com.leo.lab.solution.kotlin.removeduplicatesfromsortedlist

import com.leo.lab.question.ListNode
import com.leo.lab.question.RemoveDuplicatesFromSortedList
import com.leo.lab.solution.java.BaseTest
import org.junit.Assert
import org.junit.Test

abstract class BaseRemoveDuplicatesFromSortedListTest : BaseTest<RemoveDuplicatesFromSortedList>() {

    @Test
    fun test1() {
        // GIVEN
        val list = listOf(1, 1, 2)
        val head = createLinkedList(list)

        // WHEN
        val newHead = tested.deleteDuplicates(head)

        // THEN
        Assert.assertArrayEquals(intArrayOf(1, 2), newHead?.toList()?.toIntArray())
    }

    @Test
    fun test2() {
        // GIVEN
        val list = listOf(1, 1, 2, 3, 3)
        val head = createLinkedList(list)

        // WHEN
        val newHead = tested.deleteDuplicates(head)

        // THEN
        Assert.assertArrayEquals(intArrayOf(1, 2, 3), newHead?.toList()?.toIntArray())
    }

    @Test
    fun test3() {
        // GIVEN
        val head = null

        // WHEN
        val newHead = tested.deleteDuplicates(head)

        // THEN
        Assert.assertEquals(null, newHead)
    }

    @Test
    fun test4() {
        // GIVEN
        val list = listOf(1)
        val head = createLinkedList(list)

        // WHEN
        val newHead = tested.deleteDuplicates(head)

        // THEN
        Assert.assertArrayEquals(intArrayOf(1), newHead?.toList()?.toIntArray())
    }

    @Test
    fun test5() {
        // GIVEN
        val list = listOf(1, 1, 1, 1, 1, 1, 1)
        val head = createLinkedList(list)

        // WHEN
        val newHead = tested.deleteDuplicates(head)

        // THEN
        Assert.assertArrayEquals(intArrayOf(1), newHead?.toList()?.toIntArray())
    }

    private fun createLinkedList(list: List<Int>): ListNode? {
        if (list.isEmpty()) {
            return null
        }

        val head = ListNode(list.first())
        if (list.size == 1) {
            return head
        }

        var current: ListNode? = head
        for (i in 1 until  list.size) {
            current?.next = ListNode(list[i])
            current = current?.next
        }
        return head
    }

    private fun ListNode.toList(): List<Int> {
        val list = mutableListOf<Int>()
        var current: ListNode? = this
        while (current != null) {
            list.add(current.`val`)
            current = current.next
        }
        return list
    }
}