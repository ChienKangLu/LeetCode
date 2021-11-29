package com.leo.lab.solution.kotlin.lengthoflastword

import com.leo.lab.question.LengthOfLastWord

/**
 * @author Leo Lu
 * @since 2021/11/29
 */
class Solution : LengthOfLastWord {

    override fun lengthOfLastWord(s: String): Int {
        var length = 0
        for (i in s.length - 1 downTo 0) {
            if (s[i] == ' ' && length > 0) {
                break
            }
            if (s[i] != ' ') {
                length++
            }
        }
        return length
    }
}