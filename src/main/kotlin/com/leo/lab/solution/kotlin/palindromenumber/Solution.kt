package com.leo.lab.solution.kotlin.palindromenumber

import com.leo.lab.question.PalindromeNumber

/**
 * @author Leo Lu
 * @since 2020/06/07
 */
class Solution : PalindromeNumber {

    override fun isPalindrome(x: Int): Boolean {
        if (x < 0 || x > 0 && x % 10 == 0) {
            return false
        }

        var varX = x
        var rev  = 0
        while (rev < varX) {
            val pop = varX % 10
            rev = rev * 10 + pop
            varX /= 10
        }
        return rev == varX || varX == rev / 10
    }
}