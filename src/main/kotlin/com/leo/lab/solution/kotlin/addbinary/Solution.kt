package com.leo.lab.solution.kotlin.addbinary

import com.leo.lab.question.AddBinary

class Solution : AddBinary {
    override fun addBinary(a: String, b: String): String {
        val (long, short) = getLongSortBinary(a, b)

        val lengthDiff = long.length - short.length
        var carry = false
        var result = ""
        for (i in long.indices.reversed()) {
            val digitInLong = long[i]
            val digitIndexInShort = i - lengthDiff
            val digitInShort = if (digitIndexInShort < short.length && digitIndexInShort >= 0) short[digitIndexInShort] else '0'

            val digit = if (carry) {
                if (digitInLong != digitInShort) '0' else '1'
            } else {
                if (digitInLong != digitInShort) '1' else '0'
            }

            carry = digitInLong == '1' && digitInShort == '1' || (digitInLong != digitInShort && carry)
            result = digit + result
        }

        if (carry) {
            result = "1$result"
        }

        return result
    }

    private fun getLongSortBinary(a: String, b: String): Pair<String, String> {
        val longBinary: String
        val shortBinary: String
        if (a.length >= b.length) {
            longBinary = a
            shortBinary = b
        } else {
            longBinary = b
            shortBinary = a
        }
        return Pair(longBinary, shortBinary)
    }
}